public class CC {
    public static void main(String[] args) {
        int startingBalance = 5000;
        double rate = 0.17;
        double Month1 = (startingBalance * rate) + (startingBalance);
        double Month2 = (Month1 * rate) + Month1;
        System.out.println(" Month 1 balance after interest is " + Month1);
        System.out.println(" Month 2 balance after interest is " + Month2);

    }
}