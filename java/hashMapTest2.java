import java.util.*;

public class hashMapTest2{

    public static boolean keyExists(HashMap h, String s){
        if(h.containsKey(s))
            return true;
        else
            return false;
    }

    public static boolean valueExists(HashMap h, String s){
        if(h.containsValue(s))
            return true;
        else
            return false;
    }

    public static void showMap(HashMap<String, String> h){
        for (Map.Entry<String,String> entry : h.entrySet())  
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }

    public static void main(String[] args) {
        HashMap<String,String> h = new HashMap<String,String>();
        h.put("India","Delhi");
        h.put("Japan","Tokyo");
        h.put("West Bengal","Kolkata");
        h.put("Ahmedabad","Gandhinagar");
        System.out.println(h);
        System.out.println("The key \"India\" exists ?? =>>"+keyExists(h,"India"));
        System.out.println("The value \"Delhi\" exists ?? =>>"+valueExists(h,"Delhi"));
        showMap(h);
    }
}