import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        int number = input.nextInt();
        int keepNumber =1;
        int stableNumber=0;
        int runNumber ;

        System.out.print(stableNumber+" "+keepNumber);

        for (int i=1; i<number; i++){
            runNumber = keepNumber+stableNumber;
            stableNumber = keepNumber;
            keepNumber = runNumber;
            System.out.print(" "+runNumber);
        }





    }
}
