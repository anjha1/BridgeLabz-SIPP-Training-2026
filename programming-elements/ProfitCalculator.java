public class ProfitCalculator{
    public static void main(String[] args){
        int selling_Price = 191;
        int cost_Price = 129;
        int profit = selling_Price - cost_Price;
        float profitPercentage = (profit/cost_Price) * 100;
        System.out.println("The Cost Price is INR "+ cost_Price+
        " Selling Price is INR "+selling_Price+"\nThe Profit is INR " + profit + " the Profit Percentage is " + profitPercentage );
    }
}