import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateFromArray {
    //()
    public static void main(String[] args){
        //creating a array
        String[] names = {"java","python","javascript","java","php","sql","c++","python"};

        //using Set interface
        Set<String> store = new HashSet<>();
        for (String n : names){
            if (store.add(n)==false){
                System.out.println("Duplicate value is: "+n);
            }
        }

        System.out.println("*******************");

        //Using HashMap
        Map<String,Integer> storeMap = new HashMap<>();
        for (String name:names){
            Integer count = storeMap.get(name);
            if (count == null){
                storeMap.put(name,1);
            }
            else
                storeMap.put(name,++count);
        }

        //need to check in table if count is more than 1 and then print
        Set<Map.Entry<String,Integer>> x = storeMap.entrySet();
        for (Map.Entry<String,Integer> y:x){
            if (y.getValue()>1){
                System.out.println("Duplicated Value: "+y.getKey());
            }
        }
    }
}
