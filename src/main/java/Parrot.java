public class Parrot extends Animal {
    public Parrot(String name, int age, String colour, double weight) {
        super(name, age, colour, weight);
    }


    @Override
    public void move() {
        super.move();
        System.out.println("Попугай летает");
    }

    @Override
    public void say() {
        super.say();
        System.out.println("Попугай разговаривает");




    }
}
