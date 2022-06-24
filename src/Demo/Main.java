package Demo;

import Demo.Animal;

public class Main {

    public static void main(String[] args) {
        //int a = 10;
        Animal newAnimal = new Animal(4, "Васька");

        newAnimal.setName("Мурка");

        System.out.printf("Кол-во ног %d \n", newAnimal.getLegs());
        System.out.println("Имя " + newAnimal.getName());
        System.out.println("Голодный " + newAnimal.getHungry());

        newAnimal.eat();
        System.out.println("Голодный " + newAnimal.getHungry());

        newAnimal.eat();
    }
}
