package java_learning.lld.problems.parkinglot.exception.ticket;

public class TicketExpiredException extends RuntimeException {

    public TicketExpiredException(String message) {
        super(message);
    }
}
