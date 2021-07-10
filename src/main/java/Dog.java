public class Dog extends Animal {

    public Dog(String name, int age, String colour, double weight) {
        super(name, age, colour, weight);
    }


    @Override
    public void move() {
        super.move();
        System.out.println("Собака быстро бегает");
    }

    @Override
    public void say() {
        super.say();
        System.out.println("Собака лает");



    }
}

