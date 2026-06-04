package java_learning.lld.problems.parkinglot.entity;

import java_learning.lld.problems.parkinglot.enums.VehicleType;
import java.util.UUID;

public class Vehicle {
    private UUID id;
    private VehicleType type;
    private String licenseNumber;

    public Vehicle(UUID id, VehicleType type, String licenseNumber) {
        this.id = id;
        this.type = type;
        this.licenseNumber = licenseNumber;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((licenseNumber == null) ? 0 : licenseNumber.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehicle other = (Vehicle) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (type != other.type)
            return false;
        if (licenseNumber == null) {
            if (other.licenseNumber != null)
                return false;
        } else if (!licenseNumber.equals(other.licenseNumber))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Vehicle [id=" + id + ", type=" + type + ", licenseNumber=" + licenseNumber + "]";
    }

}
