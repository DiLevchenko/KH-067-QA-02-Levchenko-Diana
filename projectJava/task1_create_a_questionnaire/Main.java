import java.util.Scanner;

public class Println {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Where are you live, " + name + "?");
        String address = input.nextLine();
        System.out.println("Total information about user:");
        System.out.println("Name of user - " + name);
        System.out.println("Address of user - " + address);
    }
}
