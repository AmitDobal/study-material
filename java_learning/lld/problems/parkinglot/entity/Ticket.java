package java_learning.lld.problems.parkinglot.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    private UUID id;
    private LocalDateTime entryTime;
    private UUID slotId;
    private UUID vehicleId;
    private boolean isActive;

    public Ticket(UUID id, LocalDateTime entryTime, UUID slotId, UUID vehicleId, boolean isActive) {
        this.id = id;
        this.entryTime = entryTime;
        this.slotId = slotId;
        this.vehicleId = vehicleId;
        this.isActive = isActive;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public UUID getSlotId() {
        return slotId;
    }

    public void setSlotId(UUID slotId) {
        this.slotId = slotId;
    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(UUID vehicleId) {
        this.vehicleId = vehicleId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((entryTime == null) ? 0 : entryTime.hashCode());
        result = prime * result + ((slotId == null) ? 0 : slotId.hashCode());
        result = prime * result + ((vehicleId == null) ? 0 : vehicleId.hashCode());
        result = prime * result + (isActive ? 1231 : 1237);
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
        Ticket other = (Ticket) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (entryTime == null) {
            if (other.entryTime != null)
                return false;
        } else if (!entryTime.equals(other.entryTime))
            return false;
        if (slotId == null) {
            if (other.slotId != null)
                return false;
        } else if (!slotId.equals(other.slotId))
            return false;
        if (vehicleId == null) {
            if (other.vehicleId != null)
                return false;
        } else if (!vehicleId.equals(other.vehicleId))
            return false;
        if (isActive != other.isActive)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ticket [id=" + id + ", entryTime=" + entryTime + ", slotId=" + slotId + ", vehicleId=" + vehicleId
                + ", isActive=" + isActive + "]";
    }
}
