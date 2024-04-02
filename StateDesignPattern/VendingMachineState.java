package StateDesignPattern;

public interface VendingMachineState {
    void selectProduct(String product);
    void insertCoin(int amount);
    void dispenseProduct();
}
