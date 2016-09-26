/* Write a method called reverseVertical that accepts a string as its parameter and prints each letter of the string on seperate lines
in reverse order. For example, a call of reverseVertical("laptop") should produce the following output:

p
o
t
p
a
l  */

public class ThreePointEighteen
{
   public static void main(String[] args)
   {
      reverseVertical("laptop");
   }
   
   public static void reverseVertical(String word)
   {
      for(int i = word.length()-1; i >= 0; i--)
      {
         char s = word.charAt(i);
         System.out.println(s);
      }
   }
}