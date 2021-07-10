public class Cow extends  Animal{

    public Cow(String name, int age, String colour, double weight) {
        super(name, age, colour, weight);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Корова ходит");
    }

    @Override
    public void say() {
        super.say();
        System.out.println("Корова говорит мууууу");
    }
}
