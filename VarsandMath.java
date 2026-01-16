public class VarsandMath{
    public static void main(String[] args) {
        int i = 15;
        i = i + 1;
        System.out.println("i is equal to 15 + 1" + i + "\n");
        // should print 16
        int multi = 0;
        multi = 5 * i;
        System.out.println("The answer for 16x5 is " + multi + "\n");
        //should print 80
        int math1 = 0;
        math1 = Math.powExact(4,2);
        System.out.println("The value of 4 to the second power is " + math1 + "\n");
    }
}