package Basov.NCdevcourses.model;

import javax.persistence.*;

/**
 * Created by User on 11.11.2016.
 */
@Entity
@Table(name = "order", schema = "car_dealer", catalog = "")
@IdClass(OrderEntityPK.class)
public class OrderEntity {
    private int idOrders;
    private String orderscol;
    private int clientsIdClients;
    private int stateofOrdersIdStateofOrders;
    private int modelofCarIdModelofCar;
    private int modelofCarVendorIdVendor;
    private ClientEntity clientByClientsIdClients;
    private ModelofcarEntity modelofcar;
    private StateofordersEntity stateofordersByStateofOrdersIdStateofOrders;

    @Id
    @Column(name = "idOrders", nullable = false)
    public int getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(int idOrders) {
        this.idOrders = idOrders;
    }

    @Basic
    @Column(name = "Orderscol", nullable = false, length = 45)
    public String getOrderscol() {
        return orderscol;
    }

    public void setOrderscol(String orderscol) {
        this.orderscol = orderscol;
    }

    @Id
    @Column(name = "Clients_idClients", nullable = false)
    public int getClientsIdClients() {
        return clientsIdClients;
    }

    public void setClientsIdClients(int clientsIdClients) {
        this.clientsIdClients = clientsIdClients;
    }

    @Id
    @Column(name = "StateofOrders_idStateofOrders", nullable = false)
    public int getStateofOrdersIdStateofOrders() {
        return stateofOrdersIdStateofOrders;
    }

    public void setStateofOrdersIdStateofOrders(int stateofOrdersIdStateofOrders) {
        this.stateofOrdersIdStateofOrders = stateofOrdersIdStateofOrders;
    }

    @Id
    @Column(name = "ModelofCar_idModelofCar", nullable = false)
    public int getModelofCarIdModelofCar() {
        return modelofCarIdModelofCar;
    }

    public void setModelofCarIdModelofCar(int modelofCarIdModelofCar) {
        this.modelofCarIdModelofCar = modelofCarIdModelofCar;
    }

    @Id
    @Column(name = "ModelofCar_Vendor_idVendor", nullable = false)
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

        OrderEntity that = (OrderEntity) o;

        if (idOrders != that.idOrders) return false;
        if (clientsIdClients != that.clientsIdClients) return false;
        if (stateofOrdersIdStateofOrders != that.stateofOrdersIdStateofOrders) return false;
        if (modelofCarIdModelofCar != that.modelofCarIdModelofCar) return false;
        if (modelofCarVendorIdVendor != that.modelofCarVendorIdVendor) return false;
        if (orderscol != null ? !orderscol.equals(that.orderscol) : that.orderscol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrders;
        result = 31 * result + (orderscol != null ? orderscol.hashCode() : 0);
        result = 31 * result + clientsIdClients;
        result = 31 * result + stateofOrdersIdStateofOrders;
        result = 31 * result + modelofCarIdModelofCar;
        result = 31 * result + modelofCarVendorIdVendor;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Clients_idClients", referencedColumnName = "idClients", nullable = false)
    public ClientEntity getClientByClientsIdClients() {
        return clientByClientsIdClients;
    }

    public void setClientByClientsIdClients(ClientEntity clientByClientsIdClients) {
        this.clientByClientsIdClients = clientByClientsIdClients;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "ModelofCar_idModelofCar", referencedColumnName = "idModelofCar", nullable = false), @JoinColumn(name = "ModelofCar_Vendor_idVendor", referencedColumnName = "Vendor_idVendor", nullable = false)})
    public ModelofcarEntity getModelofcar() {
        return modelofcar;
    }

    public void setModelofcar(ModelofcarEntity modelofcar) {
        this.modelofcar = modelofcar;
    }

    @ManyToOne
    @JoinColumn(name = "StateofOrders_idStateofOrders", referencedColumnName = "idStateofOrders", nullable = false)
    public StateofordersEntity getStateofordersByStateofOrdersIdStateofOrders() {
        return stateofordersByStateofOrdersIdStateofOrders;
    }

    public void setStateofordersByStateofOrdersIdStateofOrders(StateofordersEntity stateofordersByStateofOrdersIdStateofOrders) {
        this.stateofordersByStateofOrdersIdStateofOrders = stateofordersByStateofOrdersIdStateofOrders;
    }
}
