/* Car

Should contain:
Fields

brand (which should be able to hold the brand name of the car)
color (holding the color of the car)
speed (holding the actual speed of the car)
Constructor

that takes 2 parameters (brand, color).
(the speed is not set here).
that takes 0 parameters, but sets the fields brand & color to “Not known”.
(the speed is not set here).
Methods

drive(int speed)

that prints the brand and color to the console
that prints the sound of the engine to the console
sets the field “speed”.
And a loop that prints 10 20 30 40 ….. and so on until the speed is reached.
        
        decreaseSpeed(int number)

that decreases the speed with that number and prints the new speed.
        increaseSpeed(int number)

that increases the speed with that number and prints the new speed.
Make sure that your fields are private and if you make any additional methods 
think about if they are public or private methods  */

public class Car
{
   private String brand;
   private String color;
   private int speed;
   
   public Car(String brand, String color)
   {
      this.brand = brand;
      this.color = color;
   }
   
   public Car()
   {
      this.brand = "Not known";
      this.color = "Not known";
   }
   
   public String getBrand()
   {
      return brand;
   }
   
   public String getColor()
   {
      return color;
   }
   
   public int getSpeed()
   {
      return speed;
   }
   
   public void drive(int speed)
   {
      System.out.println("Brand = " + getBrand() + ", Color = " + getColor());
      System.out.println("The car goes: Vroooooooom");
      this.speed = speed;
      
      int i = 0;
      while(i != speed)
      {
         i += 10;
         System.out.print(i + " ");
      }
      System.out.println();
   }
   
   public void decreaseSpeed(int number)
   {
      speed -= number;
   }
   
   public void increaseSpeed(int number)
   {
      speed += number;
   }
   
   public String toString()
   {
      return ("Car speed = " + getSpeed());
   }
}