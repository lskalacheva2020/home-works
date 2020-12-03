class App {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        System.out.println(12345 * 432);
//        System.out.println("ONE\nTWO\nTHREE");
//        printNumbersFromOneToTen();
//        printNumbersFromOneToHundred();
//        printOddNumbers();
          printEvenNumbers();
    }

    public static void printNumbersFromOneToTen() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i = i + 1;
        }
    }

    public static void printNumbersFromOneToHundred() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i = i + 1;
        }
    }

    public static void printOddNumbers() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }

    public static void printEvenNumbers() {
        int i = 16;
        while (i <= 32) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}



