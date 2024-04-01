package InterfaceSegration;

public class Client {
    public static void main(String[] args) {
        DBStore db = new DBStoreService();
        db.create();

        CashStore cashStore = new CashStoreService();
        cashStore.ReplaceKey();
    }
}
