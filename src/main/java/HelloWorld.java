import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
     //  System.out.println("Hello, World!");
      //  System.out.println(12345 * 432);
        //System.out.println("ONE\nTWO\nTHREE");
       // printNumbersFromOneToTen();
       // printNumbersFromOneToHundred();
       // printOddNumbers();
       // printEvenNumbers();
        //fooBar();
        //scannerNumberOneToN();
       //scannerNumberAToB();
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



    public static void fooBar() {
        int a = 1;
        while (a <= 100) {
            if (a % 3 == 0 && a % 5 == 0){
                System.out.println("FOOBAR");
            }
            else if (a % 3 == 0) {
                System.out.println("FOO");
            }
            else if (a % 5 == 0){
                System.out.println("BAR");
            }

            a = a + 1;
        }
    }

    public static void scannerNumberOneToN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число!");
        int number = scanner.nextInt();
        int a = 1;
        while (a <= number) {
            System.out.println(a);
            a = a + 1;

        }
    }

    public static void scannerNumberAToB() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число!");
        int a = scanner.nextInt();
        System.out.println("Введите второе число!");
        int b = scanner.nextInt();
        while (a <= b) {
            System.out.println(a);
            a = a + 1;

        }
    }


}
