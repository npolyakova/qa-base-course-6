public class AnimalClass {

  private Boolean hungry;

  public void setHungry(){
      hungry = true;
      System.out.println("Животное проглодалось");
  }

  public Boolean eat(){
      if (hungry == true){
          this.hungry = false;
      }
      else {
          //
      }
      return hungry;
  }
}
