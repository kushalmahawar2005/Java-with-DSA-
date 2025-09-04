import java.util.*;

public class SellAndBuyStock{

    public static int SellAndBuyStock(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i< price.length;i++ ) {
            if(buyPrice < price[i]) { // profit
                int profit = price[i] - buyPrice; // Today Profit 
                maxProfit = Math.max(maxProfit, profit); //All over profit
            }
            else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }


    public static void main(String args[]) {
        int price[] = {7 , 1 , 3 ,6 ,4};
        System.out.println(SellAndBuyStock(price));
    }
}