import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey, what's your name?Domino");

        Scanner scanner = new Scanner(System.in);
        // read name from terminal
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}