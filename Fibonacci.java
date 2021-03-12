/*Write a Java program to print Fibonacci series up to 100*/

public class Fibonacci {
     public static void main(String[] args) {
        for(int i = 0; i <= 100; i++){
           System.out.println(fibonacci(i));
       }
    }
     private static int fibonacci(int n){
        if ((n == 0) || (n==1))   
        return n;     
        else 
        return (fibonacci(n-1) + fibonacci(n-2));
     }
}
