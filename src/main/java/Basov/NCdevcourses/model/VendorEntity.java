package Basov.NCdevcourses.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by User on 11.11.2016.
 */
@Entity
@Table(name = "vendor", schema = "car_dealer", catalog = "")
public class VendorEntity {
    private int idVendor;
    private String vendorcol;
    private Collection<ModelofcarEntity> modelofcarsByIdVendor;

    @Id
    @Column(name = "idVendor", nullable = false)
    public int getIdVendor() {
        return idVendor;
    }

    public void setIdVendor(int idVendor) {
        this.idVendor = idVendor;
    }

    @Basic
    @Column(name = "Vendorcol", nullable = false, length = 45)
    public String getVendorcol() {
        return vendorcol;
    }

    public void setVendorcol(String vendorcol) {
        this.vendorcol = vendorcol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VendorEntity that = (VendorEntity) o;

        if (idVendor != that.idVendor) return false;
        if (vendorcol != null ? !vendorcol.equals(that.vendorcol) : that.vendorcol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idVendor;
        result = 31 * result + (vendorcol != null ? vendorcol.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "vendorByVendorIdVendor")
    public Collection<ModelofcarEntity> getModelofcarsByIdVendor() {
        return modelofcarsByIdVendor;
    }

    public void setModelofcarsByIdVendor(Collection<ModelofcarEntity> modelofcarsByIdVendor) {
        this.modelofcarsByIdVendor = modelofcarsByIdVendor;
    }
}
