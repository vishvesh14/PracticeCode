import java.util.Scanner;

public class ReverseString {
    
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String: ");
//        String origStr = sc.next();
//
//        int origStrLength = origStr.length();
//        String newStr = "";
//
//        for (int i=origStrLength-1; i>=0; i--){
//            newStr = newStr + origStr.charAt(i);
//            System.out.println("char: "+newStr);
//        }
//        System.out.println("Reverse String is: "+newStr);
//
//        //using built in method
//        StringBuilder sb = new StringBuilder(origStr);
//        StringBuilder afterReversing = sb.reverse();
//        System.out.println("Reversing using Method: "+afterReversing);

        String original_String = "Testing and Practice";
        int original_String_Length = original_String.length();
        System.out.println("Input String: "+original_String);

        String reverseString ="";
        for (int i=original_String_Length-1; i>=0; i--){
            reverseString = reverseString+original_String.charAt(i);
        }
        System.out.print("Reverse String: "+reverseString);
    }
}
