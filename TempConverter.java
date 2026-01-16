import java.util.Scanner;
public class TempConverter{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit ");
        double F = cin.nextDouble();
        double c = Math.round(((F - 32) * 5 / 9.0 ) * 100) ;
        c = c/100.00;
        System.out.printf("%2s in Fahrenheit is ", F);
        System.out.printf("%2s in Celsius\n", c);
        System.out.println("%1.2f");
    }
    //https://www.w3schools.com/java/ref_output_printf.asp
    //https://www.w3schools.com/java/ref_math_round.asp set c's precision
}