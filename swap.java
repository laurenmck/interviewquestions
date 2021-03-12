/* swap two numbers without using a temp variable*/ 

public class swap {
    public static void main(String[] args) {
        swapnums(50, 10);
        System.out.println();
        swapnums(50, 10); 
        System.out.println();
        swapnums(10, 10);
        System.out.println();
        swapnums(-50, 10);
        System.out.println();
        swapnums(-10, 50);
    }
    private static void swapnums(int num1, int num2){
        System.out.println("original: a = " + num1 + "; b = " + num2);
        num1 = num1 + num2; 
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("new: a = " + num1 + "; b = " + num2);
    }
}
