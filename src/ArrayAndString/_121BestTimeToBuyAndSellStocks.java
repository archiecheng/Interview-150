package ArrayAndString;

public class _121BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
        int [] arr1 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr1));
    }

    public static int maxProfit(int[] prices) {
        int min_price = prices[0];
        int max_profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(min_price > prices[i]){
                min_price = prices[i];
            }
            if(prices[i] - min_price > max_profit){
                max_profit = prices[i] - min_price;
            }
        }
        return max_profit;
    }
}
