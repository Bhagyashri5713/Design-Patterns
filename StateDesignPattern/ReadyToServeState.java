package StateDesignPattern;

public class ReadyToServeState implements VendingMachineState{
    private VendingMachine vendingMachine;

    public ReadyToServeState(VendingMachine vendingMachine)
    {
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void selectProduct(String product) {
        System.out.println("Product selected: " + product);
        vendingMachine.setCurrentState(vendingMachine.getProcessingPaymentState());
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("Please select a product first");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select a product first");
    }
}
