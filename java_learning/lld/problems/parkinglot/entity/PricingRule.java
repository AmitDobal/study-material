package java_learning.lld.problems.parkinglot.entity;

import java_learning.lld.problems.parkinglot.enums.PricingRuleType;
import java_learning.lld.problems.parkinglot.enums.VehicleType;

import java.util.UUID;

public class PricingRule {
    private UUID id;
    private PricingRuleType ruleType;
    private VehicleType vehicleType;
    private double hourlyFee;
    private double dailyFee;

    public PricingRule(UUID id, PricingRuleType ruleType, VehicleType vehicleType, double hourlyFee, double dailyFee) {
        this.id = id;
        this.ruleType = ruleType;
        this.vehicleType = vehicleType;
        this.hourlyFee = hourlyFee;
        this.dailyFee = dailyFee;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public PricingRuleType getRuleType() {
        return ruleType;
    }

    public void setRuleType(PricingRuleType ruleType) {
        this.ruleType = ruleType;
    }

    public double getHourlyFee() {
        return hourlyFee;
    }

    public void setHourlyFee(double hourlyFee) {
        this.hourlyFee = hourlyFee;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "PricingRule [id=" + id + ", ruleType=" + ruleType + ", vehicleType=" + vehicleType + ", hourlyFee="
                + hourlyFee + ", dailyFee=" + dailyFee + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((ruleType == null) ? 0 : ruleType.hashCode());
        result = prime * result + ((vehicleType == null) ? 0 : vehicleType.hashCode());
        long temp;
        temp = Double.doubleToLongBits(hourlyFee);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dailyFee);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        PricingRule other = (PricingRule) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (ruleType != other.ruleType)
            return false;
        if (vehicleType != other.vehicleType)
            return false;
        if (Double.doubleToLongBits(hourlyFee) != Double.doubleToLongBits(other.hourlyFee))
            return false;
        if (Double.doubleToLongBits(dailyFee) != Double.doubleToLongBits(other.dailyFee))
            return false;
        return true;
    }

}
