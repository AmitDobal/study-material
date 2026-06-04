package java_learning.lld.problems.parkinglot.entity;

import java_learning.lld.problems.parkinglot.enums.VehicleType;
import java.util.UUID;

public class ParkingSlot {
    private UUID id;
    private int floorNum;
    private VehicleType vehicleType;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSlot(UUID id, int floorNum, VehicleType vehicleType, boolean isOccupied, Vehicle vehicle) {
        this.id = id;
        this.floorNum = floorNum;
        this.vehicleType = vehicleType;
        this.isOccupied = isOccupied;
        this.vehicle = vehicle;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "ParkingSlot [id=" + id + ", floorNum=" + floorNum + ", vehicleType=" + vehicleType + ", isOccupied="
                + isOccupied + ", vehicle=" + vehicle + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + floorNum;
        result = prime * result + ((vehicleType == null) ? 0 : vehicleType.hashCode());
        result = prime * result + (isOccupied ? 1231 : 1237);
        result = prime * result + ((vehicle == null) ? 0 : vehicle.hashCode());
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
        ParkingSlot other = (ParkingSlot) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (floorNum != other.floorNum)
            return false;
        if (vehicleType != other.vehicleType)
            return false;
        if (isOccupied != other.isOccupied)
            return false;
        if (vehicle == null) {
            if (other.vehicle != null)
                return false;
        } else if (!vehicle.equals(other.vehicle))
            return false;
        return true;
    }

}
