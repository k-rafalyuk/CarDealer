package Basov.NCdevcourses.service;

import Basov.NCdevcourses.dao.ClientDao;
import Basov.NCdevcourses.model.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientDao clientDao = new ClientDao();

    public void persist(ClientEntity clientEntity) {
        clientDao.persist(clientEntity);
    }
    public void update(ClientEntity clientEntity){clientDao.update(clientEntity);}
    public List<ClientEntity> allFind(){
        return clientDao.findAll();

    }
    public void delete(Integer id ) {
        clientDao.delete(id);
    }
    public void deleteAll() {
        clientDao.deleteAll();
    }
    public ClientEntity findById(Integer id) {
        return clientDao.findById(id);
    }
}
