/* Write a method called sumOfDigits that returns the sum of absolute values of digits of an integer. For example, a call of sumOfDigits(931)
should return 13 and a call of sumOfDigits(-99) should return 18. */

public class ThreePointNine
{
   public static void main(String[] args)
   {
      sumOfDigits("931");
      sumOfDigits("-99");
   }
   
   public static void sumOfDigits(String number)
   {
      int sum = 0;
      int n = 0;
      for(int i = 0; i < number.length(); i++)
      {
         if(Character.isDigit(number.charAt(i)) == true)
         {
            n = Character.getNumericValue(number.charAt(i));
            sum += n;
         }
         else
         {
            sum += 0;
         }
      }
      System.out.println(sum);
   }
}