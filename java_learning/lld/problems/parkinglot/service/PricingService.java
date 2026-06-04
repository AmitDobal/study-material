package java_learning.lld.problems.parkinglot.service;

import java_learning.lld.problems.parkinglot.entity.Ticket;
import java_learning.lld.problems.parkinglot.repository.PricingRuleRepository;

public class PricingService {

    private final PricingRuleRepository pricingRuleRepository;

    public PricingService(PricingRuleRepository pricingRuleRepository){
        this.pricingRuleRepository = pricingRuleRepository;
    }

    public double calculatePricing(Ticket ticket) {
        /**
         * Calculatin the price on the basis of 
         * vehicle type
         */

        return 0;


    }
    
}
