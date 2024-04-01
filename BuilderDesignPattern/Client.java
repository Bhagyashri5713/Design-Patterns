package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Dog dog = Dog.builder().setBreed("Labrador").setAge(12).setName("Baby").setColor("Golden").setGender("Male").build();
        Dog d1 = Dog.builder().setName("Puppy").setAge(3).setGender("Female").build();

        System.out.println(dog);
        System.out.println(d1);
    }
}
