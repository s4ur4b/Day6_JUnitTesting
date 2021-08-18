import java.util.Scanner;

public class VendingMachine {
    public static int[] notes = {1, 2, 5, 10, 50, 100, 500, 1000};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of change required");
        int changeLeft = scan.nextInt();
        ChangeGenerator(changeLeft);
    }

    static void ChangeGenerator(int changeLeft) {
        double itemCost = 0;
        double moneyInserted = 0;
        double thousand=0;
        double fiveHundread = 0;
        double hundred = 0;
        double fifty = 0;
        double twenty = 0;
        double ten = 0;
        double five = 0;
        double two = 0;
        double one = 0;

        thousand = changeLeft / 1000;
        changeLeft = changeLeft % 1000;

        fiveHundread = changeLeft / 500;
        changeLeft = changeLeft % 500;


        hundred = changeLeft / 100;
        changeLeft = changeLeft % 100;

        fifty = changeLeft / 50;
        changeLeft = changeLeft % 50;

        twenty = changeLeft / 20;
        changeLeft = changeLeft % 20;

        ten = changeLeft / 10;
        changeLeft = changeLeft % 10;

        five = changeLeft / 5;
        changeLeft = changeLeft % 5;

        two = changeLeft / 2;
        changeLeft = changeLeft % 2;

        one = changeLeft / 1;
        changeLeft = changeLeft % 1;



        System.out.println("Change Due(Rs): \n"+thousand+" Thousand\n"+fiveHundread+" Five Hundread\n" +
                hundred + " Hundred\n" + fifty + " Fifty\n" + twenty +
                " Twenty\n" + ten + " Ten\n" + five + " Five\n" + two +
                " Two\n" + one + " one\n");


    }
}
