package java_learning.lld.problems.parkinglot.repository;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import java_learning.lld.problems.parkinglot.entity.PricingRule;
import java_learning.lld.problems.parkinglot.enums.VehicleType;

public class PricingRuleRepository {
    Map<UUID, PricingRule> pricingRules = new ConcurrentHashMap<>();

    public List<PricingRule> findAllByVehicleType(VehicleType type) {
        return pricingRules.values()
                .stream()
                .filter((rule) -> rule.getVehicleType().equals(type))
                .toList();
    }
}
