package Demo;

public class Animal {

    //поля

    private String name;
    private Boolean hungry = true;
    private int legs;

    //свойства
    public int getLegs(){
        return this.legs;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Boolean getHungry(){
        return this.hungry;
    }

    //конструктор
    public Animal(int legs, String name){
        this.legs = legs;
        this.name = name;
    }

    //методы
    public void eat(){
        if (this.hungry == true){
            System.out.println("Кушает");
            this.hungry = false;
        }
        else {
            System.out.println("Животное сытое");
        }
    }

}
