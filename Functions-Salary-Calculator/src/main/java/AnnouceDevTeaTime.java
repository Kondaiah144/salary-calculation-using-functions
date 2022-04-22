import java.util.Scanner;

public class AnnouceDevTeaTime {

    public static void anounceDeveloperTeaTime(){ //Defining Functions
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type a random word and press Enter to Start developer tea time!");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");

    }

    public static void main(String[] args) {
        System.out.println("Welcome to your new Role!");

        anounceDeveloperTeaTime(); //Calling Functions - we call functions within "main" function

        System.out.println("Write a Code");
        System.out.println("Review code");

        anounceDeveloperTeaTime();

        System.out.println("Get promoted!");
    }
}
