package Basov.NCdevcourses.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by User on 11.11.2016.
 */
public class ModelofcarEntityPK implements Serializable {
    private int idModelofCar;
    private int vendorIdVendor;

    @Column(name = "idModelofCar", nullable = false)
    @Id
    public int getIdModelofCar() {
        return idModelofCar;
    }

    public void setIdModelofCar(int idModelofCar) {
        this.idModelofCar = idModelofCar;
    }

    @Column(name = "Vendor_idVendor", nullable = false)
    @Id
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

        ModelofcarEntityPK that = (ModelofcarEntityPK) o;

        if (idModelofCar != that.idModelofCar) return false;
        if (vendorIdVendor != that.vendorIdVendor) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idModelofCar;
        result = 31 * result + vendorIdVendor;
        return result;
    }
}
