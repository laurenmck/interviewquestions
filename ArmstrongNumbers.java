/* Write a Java program to check if a number is Armstrong or not */
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
            //user input
            Scanner inputnum = new Scanner(System.in);  
            System.out.println("Enter number: ");
            int num = inputnum.nextInt();
            inputnum.close();

            System.out.print(armstrong(num));
            }
    private static boolean armstrong(int i){
        int n = i; // input number - to edit
        int r = 0; // holds digits of input number    
        int sum = 0; //holds sum of the cubed digits 

        while(n>0){
            r = n % 10; 
            sum = sum + (r*r*r); 
            n = n/10; 
        }

        if(sum == i) 
        return true;
        else 
        return false;
    }
    
}
