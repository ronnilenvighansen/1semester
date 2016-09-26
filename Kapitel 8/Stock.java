public class Stock
{
   int totalShares;
   int totalCost;
   
   public Stock(int initialTotalShares, int initialTotalCost)
   {
      totalShares = initialTotalShares;
      totalCost = initialTotalCost;
   }
   
   
   public void clear()
   {
      this.totalShares = 0;
      this.totalCost = 0;
   }
   
   public String toString()
   {
      return ("Total shares = " + totalShares + ", " + "Total cost = " + totalCost);
   }
}