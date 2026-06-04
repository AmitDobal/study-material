package java_learning.lld.problems.parkinglot.repository;

import java_learning.lld.problems.parkinglot.entity.ParkingSlot;
import java_learning.lld.problems.parkinglot.enums.VehicleType;
// import java.lld.problems.parking_lot.enums.VehicleType;
// import java.lld.problems.parking_lot.utils.UniqueIdGeneratorUtil;
// import java.util.Arrays;
// import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingSlotRepository {

    // List<ParkingSlot> parkingSlots = Arrays.asList(
    // new ParkingSlot(UniqueIdGeneratorUtil.getUniqueId(), 1, VehicleType.BIKE,
    // false, null),
    // new ParkingSlot(UniqueIdGeneratorUtil.getUniqueId(), 1, VehicleType.BIKE,
    // false, null),
    // new ParkingSlot(UniqueIdGeneratorUtil.getUniqueId(), 1, VehicleType.CAR,
    // false, null),
    // new ParkingSlot(UniqueIdGeneratorUtil.getUniqueId(), 1, VehicleType.CAR,
    // false, null),
    // new ParkingSlot(UniqueIdGeneratorUtil.getUniqueId(), 1, VehicleType.TRUCK,
    // false, null));

    Map<UUID, ParkingSlot> slots = new ConcurrentHashMap<>();

    public ParkingSlot save(ParkingSlot slot) {
        slots.put(slot.getId(), slot);
        return slot;
    }

    public Optional<ParkingSlot> getById(UUID id) {
        return Optional.ofNullable(slots.get(id));
    }

    public Optional<ParkingSlot> findAvailableSlot(VehicleType type) {

        return slots.values().stream()
                .filter(slot -> slot.getVehicleType().equals(type) && !slot.isOccupied())
                .findFirst();
    }

}
