import java.util.Scanner;

public class SimpleGreeting{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = cin.nextLine();
        System.out.println("Welcome back, " + name);
    }
    //https://www.w3schools.com/java/java_user_input.asp
}