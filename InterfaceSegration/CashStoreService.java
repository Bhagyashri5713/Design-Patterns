package InterfaceSegration;

public class CashStoreService implements CashStore{
    @Override
    public void insertKey() {
        System.out.println("Inserted the Key");
    }

    @Override
    public void ReplaceKey() {
        System.out.println("Replaced the key");
    }

    @Override
    public void evict() {
        System.out.println("Evicted the key");
    }
}
