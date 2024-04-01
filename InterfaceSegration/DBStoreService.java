package InterfaceSegration;

public class DBStoreService implements DBStore{
    @Override
    public void insert()
    {
        System.out.println("Inserted the record");
    }

    @Override
    public void delete() {
        System.out.println("deleted the record");
    }

    @Override
    public void update() {
        System.out.println("updated the record");
    }

    @Override
    public void create() {
        System.out.println("created the record");
    }
}
