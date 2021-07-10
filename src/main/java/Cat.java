public class Cat extends Animal{




    public Cat(String name, int age, String colour, double weight) {
        super(name, age, colour, weight);
    }

    @Override
        public void move() {
            super.move();
            System.out.println("Кот прыгает");





        }



 }
