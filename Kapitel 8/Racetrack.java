/* RaceTrack

Should contain:
main()

your main method
        Inside the main method you should make

an object of a car with a brand name and color.
make the car drive
decrease the speed
increase the speed
a second object of a car that has an unknown brand and color
make that car drive
decrease the speed
increase the speed */

public class Racetrack
{
   public static void main(String[] args)
   {
      Car car1 = new Car("Toyota", "Blue");
      Car car2 = new Car();
      car1.drive(50);
      car1.decreaseSpeed(20);
      System.out.println(car1.toString());
      car1.increaseSpeed(30);
      System.out.println(car1.toString());
      car2.drive(80);
      car2.decreaseSpeed(40);
      System.out.println(car2.toString());
      car2.increaseSpeed(100);
      System.out.println(car2.toString());
   }
}