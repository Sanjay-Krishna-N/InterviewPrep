/**
 * ------------------------------------------------------------------------
 * Author   : Sanjay Krishna Narayanan
 * Created  : 10/23/26
 * Version  : 1.0
 * ------------------------------------------------------------------------
 */
public class BuySell {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,5};
        System.out.println(profit(prices));
    }

    private static int profit(int[] prices) {
        int lowest = prices[0];
        int high = 0;
        for(int i = 0; i< prices.length; i++){
            if(lowest> prices[i]){
                lowest= prices[i];
            }
            int profit = prices[i]-lowest;
            if(profit>high){
                high = profit;
            }
        }
        return high;
    }
}
