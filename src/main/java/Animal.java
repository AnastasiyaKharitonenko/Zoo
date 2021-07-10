import java.util.Objects;

abstract class Animal {
    private String name;
    private int age;
    private String colour;
    private double weight;
    private boolean homeAmimal = false;


    public Animal(String name, int age, String colour, double weight) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Double.compare(animal.weight, weight) == 0 &&
                Objects.equals(name, animal.name) &&
                Objects.equals(colour, animal.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, colour, weight);
    }

    public void eat() {
        System.out.println("ВСЕ ЖИВОТНЫЕ ЕДЯТ :)");

    }

    public void breath() {
        System.out.println("Я дышу легкими :)");

    }

    public void say() {


    }

    public void move() {


    }

    public void animalIsHome() {
        homeAmimal = true;

    }

    public void isAmimalHome() {
        if (homeAmimal) {
            System.out.println("очень домашнее");
        } else {
            System.out.println("не домашнее");
        }

    }
}
