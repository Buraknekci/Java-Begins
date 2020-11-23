public class DigitsSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(98));
    }

    public static int sumDigits(int number) {

        if (number<10){
            return -1;
        }
        int sum=0;
        while (number>0){
            int digits=number%10;
            sum+=digits;
            number /= 10;
        }
        return sum;

    }

}
