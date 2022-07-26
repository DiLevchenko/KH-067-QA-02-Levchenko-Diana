import java.util.Scanner;

public class Println {
    public static void main(String[] args) {

        Scanner scName = new Scanner(System.in);
        System.out.println("What is your name?");
        String Name = scName.nextLine();

        Scanner scAddress = new Scanner(System.in);
        System.out.println("Where are you live, " + Name + "?");
        String Address = scAddress.nextLine();

        System.out.println("Total information about user:");
        System.out.println("Name of user - " + Name);
        System.out.println("Address of user - " + Address);
    }
}
