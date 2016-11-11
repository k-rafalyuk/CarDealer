package Basov.NCdevcourses.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by User on 11.11.2016.
 */
@Entity
@Table(name = "stateoforders", schema = "car_dealer", catalog = "")
public class StateofordersEntity {
    private int idStateofOrders;
    private String stateofOrderscol;
    private Collection<OrderEntity> ordersByIdStateofOrders;

    @Id
    @Column(name = "idStateofOrders", nullable = false)
    public int getIdStateofOrders() {
        return idStateofOrders;
    }

    public void setIdStateofOrders(int idStateofOrders) {
        this.idStateofOrders = idStateofOrders;
    }

    @Basic
    @Column(name = "StateofOrderscol", nullable = false, length = 45)
    public String getStateofOrderscol() {
        return stateofOrderscol;
    }

    public void setStateofOrderscol(String stateofOrderscol) {
        this.stateofOrderscol = stateofOrderscol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StateofordersEntity that = (StateofordersEntity) o;

        if (idStateofOrders != that.idStateofOrders) return false;
        if (stateofOrderscol != null ? !stateofOrderscol.equals(that.stateofOrderscol) : that.stateofOrderscol != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStateofOrders;
        result = 31 * result + (stateofOrderscol != null ? stateofOrderscol.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "stateofordersByStateofOrdersIdStateofOrders")
    public Collection<OrderEntity> getOrdersByIdStateofOrders() {
        return ordersByIdStateofOrders;
    }

    public void setOrdersByIdStateofOrders(Collection<OrderEntity> ordersByIdStateofOrders) {
        this.ordersByIdStateofOrders = ordersByIdStateofOrders;
    }
}
