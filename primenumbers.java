/*Write a Java program to print all the prime numbers from 0-100*/

public class primenumbers {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++){
            if(isprime(i) == true)
            System.out.println(i + " is prime");
        }
    }

    private static boolean isprime(int i){
        if(i==0 || i==1) return false;
        if(i==2) return true;
        else{
            for(int n = 2; n <= (i/2); n++){ //fact: no number is divisible by more than half itself 
                if (i%n == 0) return false; 
            }
        }
        return true;
    }
}
