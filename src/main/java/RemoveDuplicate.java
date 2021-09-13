
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

    public static void main (String[] args){
        //()
        //To removed duplicates from string
//        String input = "aabbccdd";
//        System.out.println("Input String: "+input);
//        String[] inputArr = input.split(" ");
//
//        Set<String> myset = new LinkedHashSet<String>(); //Set used for unique keywords and LinkedHashSet used to retrieve keywords in same insertion order
//
//        for (String x:inputArr){
//            myset.add(x);
//        }
//
//        //To iterate over the set value
//        Iterator itr = myset.iterator();
//        while (itr.hasNext()){
//            System.out.print(itr.next()+ " ");
//        }

        //To removed duplicates from a keyword
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String: ");
//        String original = sc.next();

        String original = "aabbccdd";
        String nw = " ";

        for (int i=0; i<original.length();i++){
            char c = original.charAt(i);
            System.out.println("Char: "+c);

            if(c!=' '){
                nw = nw + c;
                System.out.println("nw: "+nw);
                original = original.replace(c,' ');
                System.out.println("original: "+original);
            }
        }
        System.out.println("New Word: "+nw);
    }
}
