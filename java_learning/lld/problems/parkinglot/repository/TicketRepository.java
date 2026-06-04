package java_learning.lld.problems.parkinglot.repository;

import java_learning.lld.problems.parkinglot.entity.Ticket;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class TicketRepository {

    Map<UUID, Ticket> tickets = new ConcurrentHashMap<>();

    public void save(Ticket ticket) {
        tickets.put(ticket.getId(), ticket);
    }

    public Optional<Ticket> findById(UUID ticketId) {
        return Optional.ofNullable(tickets.get(ticketId));
    }

}
