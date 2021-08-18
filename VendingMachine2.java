import java.util.Scanner;

public class VendingMachine2 {

    public static void main(String[] args) {
        int[] notes = {1000,500,100,50,5,2,1};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of change required");
        int changeLeft = scan.nextInt();
        ChangeGenerator(changeLeft,notes);
    }

    static void ChangeGenerator(int changeLeft, int[] notes) {
        while (changeLeft>0){
            for (int i=0; i< notes.length; i++){
                int[] notesNo = new int[notes.length];
                notesNo[i]=changeLeft/notes[i];
                changeLeft=changeLeft%notes[i];
                System.out.println("Rs."+notes[i]+" ="+ notesNo[i]+" note");
            }
        }

    }
}
