public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1; //turn a negative number into a positive
        }
        int forwardNum = 0;
        forwardNum += number;
        int backwardNum = 0;
        backwardNum += number % 10;
        number /= 10;
        while (number > 0) {
            backwardNum *= 10;
            backwardNum += number % 10;
            number /= 10;
        }
        return forwardNum == backwardNum;
    }

}
