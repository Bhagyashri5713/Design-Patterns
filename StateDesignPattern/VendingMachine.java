package StateDesignPattern;

public class VendingMachine {
    private VendingMachineState readyToServeState;
    private VendingMachineState processingPaymentState;
    private VendingMachineState currentState;

    public VendingMachine() {
        readyToServeState = new ReadyToServeState(this);
        processingPaymentState = new ProcessingPaymentState(this);
        currentState = readyToServeState;
    }
    public void setCurrentState(VendingMachineState currentState) {
        this.currentState = currentState;
    }
    public VendingMachineState getReadyToServeState() {
        return readyToServeState;
    }

    public VendingMachineState getProcessingPaymentState() {
        return processingPaymentState;
    }

    public void selectProduct(String product) {
        currentState.selectProduct(product);
    }

    public void insertCoin(int amount) {
        currentState.insertCoin(amount);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct();
    }
}
