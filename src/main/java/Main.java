public class Main  {


    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 5, "серый", 12.5);
        Dog dog = new Dog("Чарли",15,"черный", 15.3);
        Parrot parrot = new Parrot("Кеша",2, "зеленый", 0.125);
        Fish fish = new Fish("Золотая рыбка", 4,"золотой",0.100);
        Crocodile crocodile = new Crocodile("Гена", 54, "зеленый", 100.5);
        Cow cow = new Cow("Дуся", 5, "белый", 89.4);
        Mussels mussels = new Mussels("Жемчужинка", 8,"серый", 0.100);




        System.out.println(" Кота зовут "+cat.getName() + "\n Собаку зовут "+ dog.getName() + "\n Попугая зовут " + parrot.getName() + "\n Рыбку зовут " + cat.getName() + "\n Крокодила зовут " + crocodile.getName() + "\n Корову зовут "+ cow.getName() + "\n Мидий зовут " + mussels.getName());
        System.out.println();

        cat.say();
        dog.say();
        parrot.say();
        fish.say();
        crocodile.say();
        cow.say();
        mussels.say();
        System.out.println();

        cat.breath();
        dog.breath();
        System.out.println();

        parrot.eat();
        cow.eat();
        System.out.println();


        cat.move();
        parrot.move();
        fish.move();


        cat.animalIsHome(); // Определяем кота как домашнее животное
        System.out.print("Кот животное ");
        cat.isAmimalHome(); // Запрашиваем статус домашнести кота






    }
}
