public class YearsCalculator {
    public static void main(String[] args) {
        printYearsAndDays(1051200);
    }


    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("İnavalid Value");
        }
        long hour = minutes / 60;
        long reamining = minutes % 60;
        long days = hour / 24;
        long remainings2 = hour % 24;
        long years = days / 365;
        System.out.println("days "+remainings2+ " years "+years+" minute "+reamining);


    }
}
