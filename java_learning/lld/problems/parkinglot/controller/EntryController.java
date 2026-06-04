package java_learning.lld.problems.parkinglot.controller;

import java_learning.lld.problems.parkinglot.dto.EntryResponseDTO;
import java_learning.lld.problems.parkinglot.entity.ParkingSlot;
import java_learning.lld.problems.parkinglot.entity.Ticket;
import java_learning.lld.problems.parkinglot.entity.Vehicle;
import java_learning.lld.problems.parkinglot.enums.VehicleType;
import java_learning.lld.problems.parkinglot.factory.VehicleFactory;
import java_learning.lld.problems.parkinglot.service.SlotService;
import java_learning.lld.problems.parkinglot.service.TicketService;

public class EntryController {

    private final SlotService slotService;
    private final TicketService ticketService;

    public EntryController(SlotService slotService, TicketService ticketService) {
        this.slotService = slotService;
        this.ticketService = ticketService;
    }

    public EntryResponseDTO entry(String licenseNumber, VehicleType vehicleType) {
        /**
         * 
         * 1. Vehicle creation
         * 2. Assign a slot and floor
         * 3. generate a ticket
         */

        try {
            Vehicle vehicle = VehicleFactory.getVehicle(vehicleType, licenseNumber);
            ParkingSlot slot = slotService.assignSlot(vehicle);
            Ticket ticket = ticketService.generateTicket(vehicle, slot);

            return new EntryResponseDTO(true, "Ticket generated successfully", ticket);
        } catch (Exception e) {
            return new EntryResponseDTO(false, e.getMessage(), null);
        }

    }

}
