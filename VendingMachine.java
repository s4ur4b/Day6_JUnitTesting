import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of change required");
        int changeLeft = scan.nextInt();
        ChangeGenerator(changeLeft);
    }

    static void ChangeGenerator(int changeLeft) {
        double thousand;
        double fiveHundread;
        double hundred;
        double fifty;
        double twenty;
        double ten;
        double five;
        double two;
        double one;

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
