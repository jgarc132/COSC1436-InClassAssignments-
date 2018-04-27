public class Car{
  private int fuel;
  private double speed;
  
  public Car(int f,double s){
  fuel = f;
  speed = s;
  }
  
  public int getFuel(){
    return fuel;
  }
  
  public double getSpeed(){
    return speed;
  }
  
  public void setFuel(int f){
    fuel = f;
  }
  public void setSpeed(double s){
    speed = s;
  }
  
  public void refuel(){
    fuel++;
    System.out.println("Refueled!");
  }
  public void drive(){
    if(fuel != 0 ){
      System.out.println("Vroom!!!!");
      fuel--;
    }else{
      System.out.println("Empty");
      }
  }
}