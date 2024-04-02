package StateDesignPattern;

public class OutOfStockState implements VendingMachineState{
    @Override
    public void selectProduct(String product) {
        System.out.println("Product is out of stock");
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("Product is out of stock");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product is out of stock");
    }
}
