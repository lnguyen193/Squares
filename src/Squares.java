import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        //Enter a number:
        //9

        //Number     Square
        //-----------    ---------
        //1                     1
        //2                     4
        //3                     9
        //4                     16
        //5                     25
        //6                    36
        //7                    49
        //8                    64
        //9                    81

        int input;
        Scanner keyBd = new Scanner(System.in);
        System.out.println("Please enter the number:");
        input = keyBd.nextInt();

        for(int i = 1; i <= input; i++){
            int square = (i*i);
            System.out.println(i + " \t" + square);
        }
    }
}
