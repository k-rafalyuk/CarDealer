package Basov.NCdevcourses.controller;

import java.util.List;

import Basov.NCdevcourses.model.ClientEntity;
import Basov.NCdevcourses.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientsRestController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List getClients() {
        return clientService.allFind();
    }

    @GetMapping("/clients/{id}")
    public ResponseEntity getClient(@PathVariable("id") Integer id) {

        ClientEntity clientEntity = clientService.findById(id);
        if (clientEntity == null) {
            return new ResponseEntity("No Client found for ID " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(clientEntity, HttpStatus.OK);
    }

    @PostMapping(value = "/clients")
    public ResponseEntity createClient(@RequestBody ClientEntity clientEntity) {

        clientService.persist(clientEntity);

        return new ResponseEntity(clientEntity, HttpStatus.OK);
    }

    @DeleteMapping("/clients/{id}")
    public ResponseEntity deleteClient(@PathVariable Integer id) {

        return new ResponseEntity(id, HttpStatus.OK);

    }
}
