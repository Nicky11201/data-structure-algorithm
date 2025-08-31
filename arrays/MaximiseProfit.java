package arrays;
public class MaximiseProfit {
    public static int maxProfit (int [] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
       return maxProfit;
    }

    public static void main (String [] args) {
        int [] prices = {2, 4, 1};
        System.out.println(maxProfit(prices));
    }
}
