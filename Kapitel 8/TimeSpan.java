public class TimeSpan
{
   public int totalMinutes;
   public int hours;
   public int minutes;
   
   public TimeSpan(int initialHours, int initialMinutes)
   {
      hours = initialHours;
      minutes = initialMinutes;
   }

   public void scale(int factor)
   {     
      totalMinutes = 60 * this.hours + this.minutes;
      this.hours = (totalMinutes * factor) / 60;
      this.minutes = (totalMinutes * factor) % 60;
   }
   
   public String toString()
   {
      return ("Hours = " + hours + ", " + "Minutes = " + minutes);
   }
}