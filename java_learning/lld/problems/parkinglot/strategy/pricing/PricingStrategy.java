package java_learning.lld.problems.parkinglot.strategy.pricing;

import java_learning.lld.problems.parkinglot.entity.Receipt;

public interface PricingStrategy {

    public double calculate(Receipt receipt);
}
