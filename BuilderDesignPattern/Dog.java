package BuilderDesignPattern;

public class Dog {
    private String breed;
    private int age;
    private String name;
    private String color;
    private String gender;
    private Dog(DogBuilder builder)
    {
        this.breed = builder.breed;
        this.age = builder.age;
        this.name = builder.name;
        this.color = builder.color;
        this.gender = builder.gender;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getGender() {
        return gender;
    }

    public static DogBuilder builder(){
        return new DogBuilder();
    }

    public static class DogBuilder{
        private String breed;
        private int age;
        private String name;
        private String color;
        private String gender;

        public DogBuilder setBreed(String breed)
        {
            this.breed = breed;
            return this;
        }
        public DogBuilder setAge(int age)
        {
            this.age = age;
            return this;
        }
        public DogBuilder setName(String name)
        {
            this.name = name;
            return this;
        }
        public DogBuilder setColor(String color)
        {
            this.color = color;
            return this;
        }
        public DogBuilder setGender(String gender)
        {
            this.gender = gender;
            return this;
        }
        public Dog build()
        {
            return new Dog(this);
        }
    }

    @Override
    public String toString(){
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
