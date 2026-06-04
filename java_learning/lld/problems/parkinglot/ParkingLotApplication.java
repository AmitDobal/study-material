package java_learning.lld.problems.parkinglot;

import java_learning.lld.problems.parkinglot.controller.EntryController;
import java_learning.lld.problems.parkinglot.dto.EntryResponseDTO;
import java_learning.lld.problems.parkinglot.enums.VehicleType;
import java_learning.lld.problems.parkinglot.repository.ParkingSlotRepository;
import java_learning.lld.problems.parkinglot.repository.TicketRepository;
import java_learning.lld.problems.parkinglot.service.SlotService;
import java_learning.lld.problems.parkinglot.service.TicketService;

public class ParkingLotApplication {

    public static void main(String[] args) {
        initializeAdmin();

        // Repositories
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();
        TicketRepository ticketRepository = new TicketRepository();

        // Services
        SlotService slotService = new SlotService(parkingSlotRepository);
        TicketService ticketService = new TicketService(ticketRepository);

        // Controllers
        EntryController entryController = new EntryController(slotService, ticketService);

        // Vehicle Arrived - Entry
        String licenseNum = "UK29AM7098";
        VehicleType type = VehicleType.CAR;

        EntryResponseDTO entry = entryController.entry(licenseNum, type);

        System.out.println(entry);
    }

    private static void initializeAdmin() {

    }

}
