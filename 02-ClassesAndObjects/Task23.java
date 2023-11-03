public class Task23 {
    public static void main(String[] args) {
        double euroBuyRate = 4.5940;
        double euroSellRate = 4.6250;

        double spread = euroSellRate - euroBuyRate;
        System.out.println("Bank buys EUR: " + euroBuyRate);
        System.out.println("Bank sells EUR: " + euroSellRate);
        System.out.printf("Spread: %.3f %n", spread);
    }
}
