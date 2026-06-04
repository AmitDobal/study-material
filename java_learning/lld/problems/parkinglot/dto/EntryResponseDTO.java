package java_learning.lld.problems.parkinglot.dto;

import java_learning.lld.problems.parkinglot.entity.Ticket;

public class EntryResponseDTO {
    private boolean status;
    private String message;

    private Ticket ticket;

    public EntryResponseDTO(boolean status, String message, Ticket ticket) {
        this.status = status;
        this.message = message;
        this.ticket = ticket;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "EntryResponseDTO [status=" + status + ", message=" + message + ", ticket=" + ticket + "]";
    }
}
