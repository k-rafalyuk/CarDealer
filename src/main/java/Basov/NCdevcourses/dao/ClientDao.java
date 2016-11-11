package Basov.NCdevcourses.dao;

import Basov.NCdevcourses.hibernate.HibernateSessionFactory;
import Basov.NCdevcourses.model.ClientEntity;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientDao implements ClientDaoInterface <ClientEntity, Integer>{

    // При таком подходе эти переменные шарятся на все потоки и если два потока одновременно зайдут в объект ClientDao, 
    // и работать будет совсем не так, как задумывалось, а вернее, вообще работать не будет. Менеджить сессии и транзакции надо либо
    // в самих методах, которые априори потокобезопасны, либо поручить это самому hibernate
    // Плюс транзакции очень желательно вынести на сервис слой
    private Session currentSession;
    private Transaction currentTransaction;

    public ClientDao(){}

    public void persist(ClientEntity clientEntity) {
        currentSession = HibernateSessionFactory.getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        currentSession.save(clientEntity);
        currentTransaction.commit();
        currentSession.close();
    }

    public void update(ClientEntity clientEntity) {
        currentSession = HibernateSessionFactory.getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        currentSession.update(clientEntity);
        currentTransaction.commit();
        currentSession.close();
    }

    public ClientEntity findById(Integer id) {
        currentSession = HibernateSessionFactory.getSessionFactory().openSession();
        ClientEntity clientEntity = (ClientEntity) currentSession.get(ClientEntity.class, id);
        currentSession.close();
        return clientEntity;
    }

    public void delete(Integer id) {
        currentSession = HibernateSessionFactory.getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        ClientEntity clientEntity = currentSession.load(ClientEntity.class, id);
        currentSession.delete(clientEntity);

        currentTransaction.commit();
        currentSession.close();
    }

    @SuppressWarnings("unchecked")
    public List<ClientEntity> findAll() {
        currentSession = HibernateSessionFactory.getSessionFactory().openSession();
        List<ClientEntity> clientEntities = (List<ClientEntity>) currentSession.createQuery("from ClientEntity").list();
        currentSession.close();
        return clientEntities;
    }

    public void deleteAll() {
        currentSession = HibernateSessionFactory.getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        currentSession.createQuery("delete from ClientEntity").executeUpdate();
        currentTransaction.commit();
        currentSession.close();
    }

}
