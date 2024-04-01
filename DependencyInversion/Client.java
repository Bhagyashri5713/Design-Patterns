package DependencyInversion;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessorPayPal = new PaymentProcessor(new PayPalGateway());
        paymentProcessorPayPal.processPayment(100.00);

        PaymentProcessor paymentProcessorStripe = new PaymentProcessor(new StripeGateway());
        paymentProcessorStripe.processPayment(150.00);
    }
}
