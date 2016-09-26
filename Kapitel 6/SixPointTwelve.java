/* Write a method called stripHtmlTags that accepts a Scanner representing an input file containing an HTML web page as its parameter, then reads
that file and prints the file's text with all HTML tags removed. A tag is any text between the characters < and >. For example, consider the
following text:

<html>
<head>
<title>My web page</title>
</head>
<body>
<p>There are many pictures of my cat here,
as well as my <b>very cool</b> blog page,
which contains <font color="red"> awesome
stuff about my trip to Vegas.</p>
Here's my cat now:<img src="cat.jpg">
</body>
</html>

If the file contained these lines, your program should produce the following text:

My web page


There are many pictures of my cat here,
as well as my very cool blog page, which contains awesome
stuff about my trip to Vegas.


Here's my cat now:

You may assume that the file is a welll-formed HTML document and there are no < or > characters inside tags. */

import java.io.*;
import java.util.*;

public class SixPointTwelve
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(new File("html.txt"));
      stripHtmlTags(input);
   }
   
   public static void stripHtmlTags(Scanner input)
   {
      String word1 = "";
      String word2 = "";
      
      while(input.hasNext())
      {
         word1 = input.nextLine();
         word2 = word1.replaceAll("\\<.*?>","");
         System.out.println(word2);
      }
   }
}

