/* Write Java program to reverse String in Java */

public class reversestring {
    public static void main(String[] args) {
        System.out.println(revstring("reverse"));
        System.out.println(revstring("string"));
        System.out.println(revstring("yay"));
        System.out.println(revstring("a"));
        System.out.println(revstring(""));
        System.out.println(revstring("reverse string"));
    }

    private static String revstring(String str){
        String output = ""; 

        for(int i = str.length()-1; i >= 0; i--){
            output = output + str.charAt(i);
        }

        return output; 
    }
}
