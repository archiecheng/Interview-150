package ArrayAndString;

public class _122BestTimeToBuyAndSellStocks2 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(maxProfit(arr1));
        int[] arr2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr2));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]){
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
