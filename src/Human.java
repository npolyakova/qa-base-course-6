public class Human {

    public void feed(AnimalClass animal){
        if (animal.eat() == false){
            System.out.println("Животное покормили");
        }
//        else {
//            System.out.println("Животное не хочет есть");
//        }

    }
}
