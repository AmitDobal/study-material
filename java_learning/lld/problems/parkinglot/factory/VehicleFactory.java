package java_learning.lld.problems.parkinglot.factory;

import java_learning.lld.problems.parkinglot.entity.Vehicle;
import java_learning.lld.problems.parkinglot.enums.VehicleType;
import java.util.UUID;

public class VehicleFactory {

    public static Vehicle getVehicle(VehicleType vehicleType, String licenseNum) {
        UUID id = UUID.randomUUID();
        if (vehicleType.equals(VehicleType.CAR)) {
            return new Vehicle(id, vehicleType, licenseNum);
        } else if (vehicleType.equals(VehicleType.BIKE)) {
            return new Vehicle(id, vehicleType, licenseNum);
        } else if (vehicleType.equals(VehicleType.TRUCK)) {
            return new Vehicle(id, vehicleType, licenseNum);
        } else {
            throw new IllegalArgumentException("Invalid Vehicle Type");
        }

    }
}
