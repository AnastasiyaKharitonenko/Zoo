public class Crocodile extends Animal {
    public Crocodile(String name, int age, String colour, double weight) {
        super(name, age, colour, weight);
    }


    @Override
    public void move() {
        super.move();
        System.out.println("Крокодил плавает и ползает");
    }

    @Override
    public void say() {
        super.say();
        System.out.println("Крокодил молчит");
    }
}

