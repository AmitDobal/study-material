package java_learning.lld.problems.parkinglot.service;

import java_learning.lld.problems.parkinglot.entity.ParkingSlot;
import java_learning.lld.problems.parkinglot.entity.Ticket;
import java_learning.lld.problems.parkinglot.entity.Vehicle;
import java_learning.lld.problems.parkinglot.exception.ticket.NoTicketFoundException;
import java_learning.lld.problems.parkinglot.exception.ticket.TicketExpiredException;
import java_learning.lld.problems.parkinglot.repository.TicketRepository;
import java_learning.lld.problems.parkinglot.utils.UniqueIdGeneratorUtil;
import java.time.LocalDateTime;
import java.util.UUID;

public class TicketService {

    private final TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSlot slot) {
        Ticket ticket = new Ticket(UniqueIdGeneratorUtil.getUniqueId(), LocalDateTime.now(), slot.getId(),
                vehicle.getId(), true);
        repository.save(ticket);
        return ticket;
    }

    public Ticket validateTicket(UUID ticketId) {
        Ticket ticket = repository.findById(ticketId)
                .orElseThrow(() -> new NoTicketFoundException("Ticket with id: " + ticketId + " is not found!"));

        if (!ticket.isActive()) {
            throw new TicketExpiredException("The Ticket is Inactive/Expired!");
        }

        return ticket;
    }

}
