package StateDesignPattern;

public class ProcessingPaymentState implements VendingMachineState{
    private VendingMachine vendingMachine;

    public ProcessingPaymentState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void selectProduct(String product) {
        System.out.println("Already processing payment");
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("Payment processing...");
        vendingMachine.setCurrentState(vendingMachine.getReadyToServeState());
        vendingMachine.dispenseProduct();
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Payment is not completed yet");
    }
}
