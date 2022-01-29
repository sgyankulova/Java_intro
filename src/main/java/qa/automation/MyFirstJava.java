package qa.automation;

import java.util.Scanner;

public class MyFirstJava {

    public static void main(String[] args) {

        System.out.println("Please, enter your first name:");

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();

        System.out.println("Please, enter your favorite hobby:");

        String userHobby = scanner.next();

        System.out.println("Your name is: " + firstName +
                "\nYour favorite hobby is: " + userHobby);

    }
}
