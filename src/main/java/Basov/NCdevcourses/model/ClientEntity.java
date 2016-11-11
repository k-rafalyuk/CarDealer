package Basov.NCdevcourses.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by User on 11.11.2016.
 */
@Entity
@Table(name = "client", schema = "car_dealer", catalog = "")
public class ClientEntity {
    private int idClients;
    private String name;
    private Collection<OrderEntity> ordersByIdClients;

    @Id
    @Column(name = "idClients", nullable = false)
    public int getIdClients() {
        return idClients;
    }

    public void setIdClients(int idClients) {
        this.idClients = idClients;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientEntity that = (ClientEntity) o;

        if (idClients != that.idClients) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idClients;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "clientByClientsIdClients")
    public Collection<OrderEntity> getOrdersByIdClients() {
        return ordersByIdClients;
    }

    public void setOrdersByIdClients(Collection<OrderEntity> ordersByIdClients) {
        this.ordersByIdClients = ordersByIdClients;
    }
}
