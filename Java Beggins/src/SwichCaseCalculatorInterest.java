public class SwichCaseCalculatorInterest {
    public static void main(String[] args) {


        for (int i = 8; i >= 2; i--) {

            System.out.println("% interst " + i + String.format("  %2f", calculateInterest(10000, i)));
        }

    }

    public static double calculateInterest(double interstrate, double amounth) {

        return amounth * interstrate / 100;
    }
}

