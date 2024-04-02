package StateDesignPattern;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.selectProduct("Soda");
        vendingMachine.insertCoin(15);
        vendingMachine.selectProduct("Chips");
        vendingMachine.insertCoin(15);
        vendingMachine.dispenseProduct();
    }
}
