package Basov.NCdevcourses.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

/**
 * Created by User on 11.11.2016.
 */
@Entity
@Table(name = "modelofcar", schema = "car_dealer", catalog = "")
@IdClass(ModelofcarEntityPK.class)
public class ModelofcarEntity {
    private int idModelofCar;
    private String modelofCarcol;
    private Date productionYear;
    private int vendorIdVendor;
    private VendorEntity vendorByVendorIdVendor;
    private Collection<OrderEntity> orders;

    @Id
    @Column(name = "idModelofCar", nullable = false)
    public int getIdModelofCar() {
        return idModelofCar;
    }

    public void setIdModelofCar(int idModelofCar) {
        this.idModelofCar = idModelofCar;
    }

    @Basic
    @Column(name = "ModelofCarcol", nullable = false, length = 45)
    public String getModelofCarcol() {
        return modelofCarcol;
    }

    public void setModelofCarcol(String modelofCarcol) {
        this.modelofCarcol = modelofCarcol;
    }

    @Basic
    @Column(name = "Production_Year", nullable = false)
    public Date getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Date productionYear) {
        this.productionYear = productionYear;
    }

    @Id
    @Column(name = "Vendor_idVendor", nullable = false)
    public int getVendorIdVendor() {
        return vendorIdVendor;
    }

    public void setVendorIdVendor(int vendorIdVendor) {
        this.vendorIdVendor = vendorIdVendor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelofcarEntity that = (ModelofcarEntity) o;

        if (idModelofCar != that.idModelofCar) return false;
        if (vendorIdVendor != that.vendorIdVendor) return false;
        if (modelofCarcol != null ? !modelofCarcol.equals(that.modelofCarcol) : that.modelofCarcol != null)
            return false;
        if (productionYear != null ? !productionYear.equals(that.productionYear) : that.productionYear != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idModelofCar;
        result = 31 * result + (modelofCarcol != null ? modelofCarcol.hashCode() : 0);
        result = 31 * result + (productionYear != null ? productionYear.hashCode() : 0);
        result = 31 * result + vendorIdVendor;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Vendor_idVendor", referencedColumnName = "idVendor", nullable = false)
    public VendorEntity getVendorByVendorIdVendor() {
        return vendorByVendorIdVendor;
    }

    public void setVendorByVendorIdVendor(VendorEntity vendorByVendorIdVendor) {
        this.vendorByVendorIdVendor = vendorByVendorIdVendor;
    }

    @OneToMany(mappedBy = "modelofcar")
    public Collection<OrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(Collection<OrderEntity> orders) {
        this.orders = orders;
    }
}
