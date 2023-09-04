public class OddNumberPrinter {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        printOddNumbers(start, end);
    }

    public static void printOddNumbers(int start, int end) {
        if (start > end) {
            return;
        }

        if (start % 2 != 0) {
            System.out.println(start);
        }


        printOddNumbers(start + 1, end);
    }
}







