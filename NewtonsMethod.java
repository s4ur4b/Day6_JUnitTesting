import java.util.Scanner;

public class NewtonsMethod {
    //main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double c = scan.nextDouble();
        double sqrtOfNumber = sqrtUsingNewton(c);
        System.out.println("The square root of the number is : " + sqrtOfNumber);

    }

    // returns square root of number
     static double sqrtUsingNewton(double c) {
        double t = c;
         double epsilon=Math.pow(10,-15);
        //formula to calculate roots
        while (true) {
            t = (t + (c / t)) * 0.5;
            if (Math.abs(t - c / t) < (epsilon * t))
                break;
        }
         return t;
     }
}

