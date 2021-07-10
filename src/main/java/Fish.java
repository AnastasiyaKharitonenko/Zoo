public class Fish extends Animal {
    public Fish(String name, int age, String colour, double weight) {
        super(name, age, colour, weight);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Рыба плавает");
    }

    @Override
    public void say() {
        super.say();
        System.out.println("Рыбы молчат");

    }

    @Override
    public void breath() {
        super.breath();
        System.out.println("Рыбки дышат жабрами");
    }
}
