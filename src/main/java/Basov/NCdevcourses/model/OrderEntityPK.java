package Basov.NCdevcourses.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by User on 11.11.2016.
 */
public class OrderEntityPK implements Serializable {
    private int idOrders;
    private int clientsIdClients;
    private int stateofOrdersIdStateofOrders;
    private int modelofCarIdModelofCar;
    private int modelofCarVendorIdVendor;

    @Column(name = "idOrders", nullable = false)
    @Id
    public int getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(int idOrders) {
        this.idOrders = idOrders;
    }

    @Column(name = "Clients_idClients", nullable = false)
    @Id
    public int getClientsIdClients() {
        return clientsIdClients;
    }

    public void setClientsIdClients(int clientsIdClients) {
        this.clientsIdClients = clientsIdClients;
    }

    @Column(name = "StateofOrders_idStateofOrders", nullable = false)
    @Id
    public int getStateofOrdersIdStateofOrders() {
        return stateofOrdersIdStateofOrders;
    }

    public void setStateofOrdersIdStateofOrders(int stateofOrdersIdStateofOrders) {
        this.stateofOrdersIdStateofOrders = stateofOrdersIdStateofOrders;
    }

    @Column(name = "ModelofCar_idModelofCar", nullable = false)
    @Id
    public int getModelofCarIdModelofCar() {
        return modelofCarIdModelofCar;
    }

    public void setModelofCarIdModelofCar(int modelofCarIdModelofCar) {
        this.modelofCarIdModelofCar = modelofCarIdModelofCar;
    }

    @Column(name = "ModelofCar_Vendor_idVendor", nullable = false)
    @Id
    public int getModelofCarVendorIdVendor() {
        return modelofCarVendorIdVendor;
    }

    public void setModelofCarVendorIdVendor(int modelofCarVendorIdVendor) {
        this.modelofCarVendorIdVendor = modelofCarVendorIdVendor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntityPK that = (OrderEntityPK) o;

        if (idOrders != that.idOrders) return false;
        if (clientsIdClients != that.clientsIdClients) return false;
        if (stateofOrdersIdStateofOrders != that.stateofOrdersIdStateofOrders) return false;
        if (modelofCarIdModelofCar != that.modelofCarIdModelofCar) return false;
        if (modelofCarVendorIdVendor != that.modelofCarVendorIdVendor) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrders;
        result = 31 * result + clientsIdClients;
        result = 31 * result + stateofOrdersIdStateofOrders;
        result = 31 * result + modelofCarIdModelofCar;
        result = 31 * result + modelofCarVendorIdVendor;
        return result;
    }
}
