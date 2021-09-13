import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashingCode {

    public static void main(String[] args) {
        //()
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("James", "445566");
        phonebook.put("Ralph", "897895");
        phonebook.put("Tom", "985653");

        //To print single key value pair
        System.out.println("Phone: " + phonebook.get("James")+"\n");

        //To iterate all values from Map, you need to use Map method i.e: keySet()
        Set<String> keys = phonebook.keySet();
        for (String i : keys) {
            System.out.println("Values: " + phonebook.get(i)+"\n");
        }

        //Using Entry interface, it is a interface inside the Map interface [i.e: nested interface]
        Set <Map.Entry<String,String>> values = phonebook.entrySet();
        System.out.println(values);
        for (Map.Entry<String,String> e : values){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
