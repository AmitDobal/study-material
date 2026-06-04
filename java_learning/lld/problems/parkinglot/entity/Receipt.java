package java_learning.lld.problems.parkinglot.entity;

import java_learning.lld.problems.parkinglot.enums.PaymentStatus;
import java.time.LocalDateTime;
import java.util.UUID;

public class Receipt {
    private UUID id;
    private UUID ticketId;
    private LocalDateTime exitTime;
    private double totalFee;
    private PaymentStatus paymentStatus;

    public Receipt(UUID id, UUID ticketId, LocalDateTime exitTime, double totalFee, PaymentStatus paymentStatus) {
        this.id = id;
        this.ticketId = ticketId;
        this.exitTime = exitTime;
        this.totalFee = totalFee;
        this.paymentStatus = paymentStatus;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getTicketId() {
        return ticketId;
    }

    public void setTicketId(UUID ticketId) {
        this.ticketId = ticketId;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((ticketId == null) ? 0 : ticketId.hashCode());
        result = prime * result + ((exitTime == null) ? 0 : exitTime.hashCode());
        long temp;
        temp = Double.doubleToLongBits(totalFee);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((paymentStatus == null) ? 0 : paymentStatus.hashCode());
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
        Receipt other = (Receipt) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (ticketId == null) {
            if (other.ticketId != null)
                return false;
        } else if (!ticketId.equals(other.ticketId))
            return false;
        if (exitTime == null) {
            if (other.exitTime != null)
                return false;
        } else if (!exitTime.equals(other.exitTime))
            return false;
        if (Double.doubleToLongBits(totalFee) != Double.doubleToLongBits(other.totalFee))
            return false;
        if (paymentStatus != other.paymentStatus)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Receipt [id=" + id + ", ticketId=" + ticketId + ", exitTime=" + exitTime + ", totalFee=" + totalFee
                + ", paymentStatus=" + paymentStatus + "]";
    }
}
