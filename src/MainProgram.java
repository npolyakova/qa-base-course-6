public class MainProgram {

    //Человек должен покормить кошку и собаку
    public static void main(String[] args) {
        Human vasya = new Human();
        AnimalClass cat = new AnimalClass();
        AnimalClass dog = new AnimalClass();

        cat.setHungry();
        vasya.feed(cat);
        vasya.feed(cat); //выводилось, что кот сытый, животное не хочет есть

        dog.setHungry();
        vasya.feed(dog);
    }
}
