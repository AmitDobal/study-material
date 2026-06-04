
interface PaymentGateway {
    void pay(String orderId, double amount);
}

class PayUGateway implements PaymentGateway {
    @Override
    public void pay(String orderId, double amount) {
        System.out.println("Paid amount: " + amount + " using PayU for order ID: " + orderId);
    }
}

class RazorpayAdapter implements PaymentGateway {
    private final RazorpayAPI razorpayAPI;

    public RazorpayAdapter(){
        this.razorpayAPI = new RazorpayAPI();
    }

    @Override
    public void pay(String orderId, double amount) {
        // System.out.println("Paid amount: " + amount + " using Razorpay for order ID: " + orderId);
        razorpayAPI.makePayment(orderId, amount);
    }
}

class RazorpayAPI {
    public void makePayment(String invoiceId, double amointInPaise){
        System.out.println("Paid " + amointInPaise + " P using Razorpay API for invoice ID: " + invoiceId );
    }
}

class CheckoutService {
    private final PaymentGateway paymentGateway;

    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(String orderId, double amount) {
        // other processings
        paymentGateway.pay(orderId, amount);
        // other processings
    }
}

public class Adaptor {
    public static void main(String[] args) {

        // PaymentGateway payUGateway = new PayUGateway();
        PaymentGateway razGateway = new RazorpayAdapter();
        CheckoutService checkoutService = new CheckoutService(razGateway);
        checkoutService.checkout("12345", 100.00);
    }
}
