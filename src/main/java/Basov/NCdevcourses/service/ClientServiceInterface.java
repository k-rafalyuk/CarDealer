package Basov.NCdevcourses.service;

import Basov.NCdevcourses.model.ClientEntity;

import java.util.List;

/**
 * Created by User on 08.11.2016.
 */
public interface ClientServiceInterface {
    public void addClient(ClientEntity clientEntity);

    public List<ClientEntity> clientsEntityList();

    public void removeClient(Integer id);
}
