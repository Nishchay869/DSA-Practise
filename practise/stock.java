package practise;

public class stock {
    public static int stock(int prices[]){
        int maxprofit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = (prices[i]-buyPrice);
                maxprofit = Math.max(profit,maxprofit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[] = {7,6,4,3,1};
        System.out.print(stock(prices));
    }
}
