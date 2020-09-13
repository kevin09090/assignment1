// two type of inheritance concept    subclass & superclass
 // subclass - inherits from another class
 // superclass - being inherited from

 class Vehicle {
    protected String brand = "Ford"; // protected = The code is accessible in the same package and subclasses
    public void honk() {
      System.out.println("Tuut, tuut!"); // output: "Tuut, tuut!"
    }
}
  
class Car extends Vehicle {
     private String modelName = "Mustang";
     public static void main(String[] args) {
      Car myFastCar = new Car();
      myFastCar.honk();
      System.out.println(myFastCar.brand + " " + myFastCar.modelName);// output:Ford Mustang  
    }
}
  