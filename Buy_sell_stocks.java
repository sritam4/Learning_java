public class Buy_sell_stocks {
    public static void profit(int price[])
    {
        int buy_price=Integer.MAX_VALUE;
        int max_profit=0;
        int sell_day=0;
        int buy_day=0;

        for(int i=0;i<price.length;i++)
        {
            if(buy_price<price[i])
            {
                int profit=price[i]-buy_price;
                // max_profit=Math.max(max_profit,profit);
                if(max_profit<profit)
                {
                    max_profit=profit;
                    sell_day=i+1; //we sell the stock on day of highest profit
                }
            } 
            else{
                buy_price=price[i];
                buy_day=i+1; // we buy the stock on day when stock price is minimum
            }
        }
        System.out.println("Maximum profit will be '"+max_profit+"' when buying the stock on day '"+buy_day+"' and selling on day '"+sell_day+"'.");
    }

    public static void main(String args[])
    {
        int prices[]={7,1,5,3,6,4};

        profit(prices);
    }
}
