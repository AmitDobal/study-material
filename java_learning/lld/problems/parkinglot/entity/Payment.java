package java_learning.lld.problems.parkinglot.entity;

import java_learning.lld.problems.parkinglot.enums.PaymentGatewayType;
import java_learning.lld.problems.parkinglot.enums.PaymentStatus;
import java.util.UUID;

public class Payment {
    private UUID id;
    private PaymentStatus status;
    private UUID ticketId;
    private double ammount;
    private PaymentGatewayType paymentGateway;

    public Payment(UUID id, PaymentStatus status, UUID ticketId, double ammount, PaymentGatewayType paymentGateway) {
        this.id = id;
        this.status = status;
        this.ticketId = ticketId;
        this.ammount = ammount;
        this.paymentGateway = paymentGateway;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public UUID getTicketId() {
        return ticketId;
    }

    public void setTicketId(UUID ticketId) {
        this.ticketId = ticketId;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public PaymentGatewayType getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(PaymentGatewayType paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((ticketId == null) ? 0 : ticketId.hashCode());
        long temp;
        temp = Double.doubleToLongBits(ammount);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((paymentGateway == null) ? 0 : paymentGateway.hashCode());
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
        Payment other = (Payment) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (status != other.status)
            return false;
        if (ticketId == null) {
            if (other.ticketId != null)
                return false;
        } else if (!ticketId.equals(other.ticketId))
            return false;
        if (Double.doubleToLongBits(ammount) != Double.doubleToLongBits(other.ammount))
            return false;
        if (paymentGateway != other.paymentGateway)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Payment [id=" + id + ", status=" + status + ", ticketId=" + ticketId + ", ammount=" + ammount
                + ", paymentGateway=" + paymentGateway + "]";
    }

}
