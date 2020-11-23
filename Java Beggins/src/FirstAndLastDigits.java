public class FirstAndLastDigits {
    public static void main(String[] args) {


        System.out.println(sumFirstAndLastDigits(252));
    }

    public static int sumFirstAndLastDigits(int number) {

        // number = 12 should output 3
        int num = number;
        if (num < 0) {
            return -1;
        }
        int lastDigit = num % 10;

        while (num >= 10) {
            num /= 10;
        }
        int firstDigit = num;
        return firstDigit + lastDigit;
    }
}