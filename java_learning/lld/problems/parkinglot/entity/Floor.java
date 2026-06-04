package java_learning.lld.problems.parkinglot.entity;

import java.util.List;
import java.util.UUID;

public class Floor {
    private UUID id;
    private int floorNum;
    private List<ParkingSlot> slots;

    public Floor(UUID id, int floorNum, List<ParkingSlot> slots) {
        this.id = id;
        this.floorNum = floorNum;
        this.slots = slots;
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

    public List<ParkingSlot> getSlots() {
        return slots;
    }

    public void setSlots(List<ParkingSlot> slots) {
        this.slots = slots;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + floorNum;
        result = prime * result + ((slots == null) ? 0 : slots.hashCode());
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
        Floor other = (Floor) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (floorNum != other.floorNum)
            return false;
        if (slots == null) {
            if (other.slots != null)
                return false;
        } else if (!slots.equals(other.slots))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Floor [id=" + id + ", floorNum=" + floorNum + ", slots=" + slots + "]";
    }

}
