/* Write a method called swapPairs that accepts a String as a parameter and returns that string with each pair of adjacent letters reversed.
If the String has an odd number of letters, the last letter is unchanged. For example, the call swapPairs("example") should return "xemalpe"
and the call swapPairs("hello there") should return "ehll otree". */

public class FourPointSeventeen
{
   public static void main(String[] args)
   {
      System.out.println(swapPairs("example"));
      System.out.println(swapPairs("hello there"));
   }
   
   public static String swapPairs(String s)
   {
      char c;
      String w = ("");
      if(s.length() % 2 == 0)
      {
         for(int i = 0; i < s.length(); i += 2)
         {
            c = s.charAt(i+1);
            w += c;
            c = s.charAt(i);
            w += c;
         }
      }
      
      if(s.length() % 2 == 1)
      {
         for(int i = 0; i < s.length()-1; i += 2)
         {
            c = s.charAt(i+1);
            w += c;
            c = s.charAt(i);
            w += c;
         }
         w += s.charAt(s.length()-1);
      }
      return w;
   }
}