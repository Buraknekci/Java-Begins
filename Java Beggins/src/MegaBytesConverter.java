public class MegaBytesConverter {

    public static void converter(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int inMegaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            String result = kiloBytes + " KB " + "= " + inMegaBytes + " MB " + "and " + remainingKiloBytes + " KB";
            System.out.println(result);
        }
    }
    public static void main(String[] args){
        converter(2555);

    }
}