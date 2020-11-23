public class WhileLoopEveNumbers {
    public static void main(String[] args) {
        int number = 4;
        int finish = 34;
        while (number <= finish) {
            number++;
            if (!İsEvenNumber(number)) {
                continue;
            }
            System.out.println("even=" + number);
        }


        System.out.println("-----");
        int count = 0;
        while (count != 5) {
            System.out.println(count);
            count++;
        }
        System.out.println("-------------");
        count = 1;
        while (true) {
            if (count == 7) {
                break;
            }
            System.out.println(count);
            count++;
        }


        System.out.println("------");
        count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count != 6);

    }

    public static boolean İsEvenNumber(int number) {

        while (true) {
            if (number % 2 == 0) {
                boolean b = true;
                return b;

            } else {
                boolean b = false;
                return b;
            }

        }

    }
}
