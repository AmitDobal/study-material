package java_learning.lld.problems.parkinglot.controller;

import java.util.UUID;

import java_learning.lld.problems.parkinglot.dto.ExitResponseDTO;
import java_learning.lld.problems.parkinglot.entity.Receipt;
import java_learning.lld.problems.parkinglot.entity.Ticket;
import java_learning.lld.problems.parkinglot.service.PaymentService;
import java_learning.lld.problems.parkinglot.service.PricingService;
import java_learning.lld.problems.parkinglot.service.ReceiptService;
import java_learning.lld.problems.parkinglot.service.TicketService;

public class ExitController {

    private final TicketService ticketService;
    private final PaymentService paymentService;
    private final ReceiptService receiptService;
    private final PricingService pricingService;

    public ExitController(TicketService ticketService, PaymentService paymentService, ReceiptService receiptService,
            PricingService pricingService) {
        this.ticketService = ticketService;
        this.paymentService = paymentService;
        this.receiptService = receiptService;
        this.pricingService = pricingService;
    }

    public ExitResponseDTO exit(UUID ticketId) {

        try {
            /**
             * 1. Validate ticket
             * 2. Price calculation
             * 2. Payment
             * 3. RecieptGeneration
             */

            Ticket ticket = ticketService.validateTicket(ticketId);
            Receipt receipt = receiptService.generateReceipt(ticket);
            double amount = pricingService.calculatePricing(ticket);
            UUID paymentId = paymentService.processPayment(amount, ticket);
            

            return new ExitResponseDTO(true, "Success", receipt);

        } catch (Exception e) {
            return new ExitResponseDTO(false, e.getMessage(), null);
        }
    }

}
