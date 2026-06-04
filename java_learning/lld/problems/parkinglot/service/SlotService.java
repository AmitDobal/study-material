package java_learning.lld.problems.parkinglot.service;

import java_learning.lld.problems.parkinglot.entity.ParkingSlot;
import java_learning.lld.problems.parkinglot.entity.Vehicle;
import java_learning.lld.problems.parkinglot.exception.slot.NoSlotAvailableException;
import java_learning.lld.problems.parkinglot.repository.ParkingSlotRepository;

public class SlotService {

    private final ParkingSlotRepository slotRepository;

    public SlotService(ParkingSlotRepository slotRepository) {
        this.slotRepository = slotRepository;
    }

    public ParkingSlot assignSlot(Vehicle vehicle) {
        ParkingSlot slot = slotRepository
                .findAvailableSlot(vehicle.getType())
                .orElseThrow(
                        () -> new NoSlotAvailableException("No Available slot for vehivle type: " + vehicle.getType()));
        
        return slot;
    }

}
