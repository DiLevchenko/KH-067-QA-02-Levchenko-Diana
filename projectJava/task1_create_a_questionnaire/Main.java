import java.util.Scanner;

public class Println {
    public static void main(String[] args) {

        Scanner scName = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scName.nextLine();

        Scanner scAddress = new Scanner(System.in);
        System.out.println("Where are you live, " + name + "?");
        String address = scAddress.nextLine();

        System.out.println("Total information about user:");
        System.out.println("Name of user - " + name);
        System.out.println("Address of user - " + address);
    }
}
