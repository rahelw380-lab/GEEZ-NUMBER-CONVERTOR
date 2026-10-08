import java.util.Scanner;

public class App {

    static final String[] ONES = {"", "፩", "፪", "፫", "፬", "፭", "፮", "፯", "፰", "፱"};
    static final String[] TENS = {"", "፲", "፳", "፴", "፵", "፶", "፷", "፸", "፹", "፺"};

    
    static String twoDigits(int n) {
        return TENS[n / 10] + ONES[n % 10];
    }

    
    static String toGeez(int n) {
        int hundreds = n / 100;
        int rest = n % 100;
        String result = "";

        if (hundreds > 0) {
            if (hundreds > 1) {
                result += twoDigits(hundreds);
            }
            result += "፻";
        }
        return result + twoDigits(rest);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("╔══════════════════════════════╗");
        System.out.println("║    GEEZ NUMBER CONVERTER        ║");
        System.out.println("╚══════════════════════════════╝");

        while (true) {
            System.out.print("\nEnter a number(1-9999, enter 0 to exit1): ");
            int n = input.nextInt();

            if (n == 0) {
                System.out.println("Goodbye! ");
                break;
            }
            if (n < 1 || n > 9999) {
                System.out.println("Please enter a number between 1 and 9999");
                continue;
            }
            System.out.println(n + "  →  " + toGeez(n));
        }
        input.close();
    }
}