package Demo;

public class Animal {

    //����

    private String name;
    private Boolean hungry = true;
    private int legs;

    //��������
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

    //�����������
    public Animal(int legs, String name){
        this.legs = legs;
        this.name = name;
    }

    //������
    public void eat(){
        if (this.hungry == true){
            System.out.println("������");
            this.hungry = false;
        }
        else {
            System.out.println("�������� �����");
        }
    }

}
