public class House
{
   public static void main(String[] args)
   {
      mystery(1600, 40);
   }
   
   public static void mystery(int i, int j) {
    while (i != 0 && j != 0) {
        i = i / j;
        j = (j - 1) / 2;
        System.out.print(i + " " + j + " ");
    }
    System.out.println(i);
}

}