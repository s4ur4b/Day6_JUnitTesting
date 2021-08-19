import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        toBinary(number);
    }
    static void toBinary(int number){
    int binary[] = new int[31];
    int index=0;
    while (number!=0){
        binary[index++] = number%2;
        number=number/2;

    }
    for (int i = index - 1; i>=0;i--){
        System.out.print(binary[i]);
    }
    }
}
