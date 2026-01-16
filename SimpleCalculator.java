import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double n1 = cin.nextDouble();
        System.out.println("Enter operation(+(add),-(subtract),x(multiply),/(divide)): ");
        String o1 = cin.next();
        System.out.println("Enter second number: ");
        double n2 = cin.nextDouble();
        if(o1.equals("+")){
            double ans = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + ans);
        } else if (o1.equals("-")){
            double ans = n1 - n2;
            System.out.println(n1 +" - " + n2 + " = " + ans);
        } else if (o1.equals("x")) {
            double ans = n1 * n2;
            System.out.println(n1 + " x " + n2 + " = " + ans);
        } else if (o1.equals("/")) {
            double ans = n1 / n2;
            System.out.println(n1 + " / " + n2 + " = " + ans);
        }
    }
}//https://www.w3schools.com/java/java_conditions.asp