import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CountDuplicateString {
    //()
    public static void removeDuplcateString(String InputString){
        //To store the word and its count
        HashMap<String,Integer> hm = new HashMap<>();

        //Split the sentence into words
        String[] s = InputString.split(" ");

        for (String tempString : s){

            //To check if word already in table
            if(hm.get(tempString)!=null){
                hm.put(tempString, hm.get(tempString)+1);
            }
            else {
                hm.put(tempString,1);
            }
        }
        System.out.println(hm);

        //Need to only display the duplicate words so iterating over the hashtable
        Iterator<String> tempString = hm.keySet().iterator();
        while (tempString.hasNext())
        {
            String temp = tempString.next();
            if (hm.get(temp)>1){
                System.out.println("The word "+temp+" has appeared "+hm.get(temp)+ " no of times");
            }
        }
    }

    public static void main (String[] args){
        removeDuplcateString("john is john and nobody is nobody nobody");
    }
}
