import java.util.Scanner;
public class LCMandGCFCalculator {
    public static void main(String[] args) {
        int number1, number2, LCM, GCF;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        int a = number1, b = number2;

        //Euclid Algorithm
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        GCF = a;

        LCM = (number1 * number2) / GCF;

        System.out.println("Least Common Multiple of " + number1 + " and " + number2 + " is: " + LCM);
        System.out.println("Greatest Common Factor of " + number1 + " and " + number2 + " is: " + GCF);
    }
}
