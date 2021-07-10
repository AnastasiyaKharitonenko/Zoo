public class Mussels extends Animal {
    public Mussels(String name, int age, String colour, double weight) {
        super(name, age, colour, weight);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Мидии плавают");
    }

    @Override
    public void say() {
        super.say();
        System.out.println("Мидии молчат");
    }

    @Override
    public void breath() {
        super.breath();
        System.out.println("Не знаю как я дышу, но точно дышу");
    }
}

