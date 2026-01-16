import java.util.Scanner;
public class CircleArea{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Give me a number for radius: ");
        double r = cin.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        System.out.println("The area of a circle with radius of " + r + " is " + area);
    } //https://www.w3schools.com/java/java_user_input.asp#gsc.tab=0
}