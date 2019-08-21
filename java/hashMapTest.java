import java.util.*;
// import org.apache.commons.collections.*;

public class hashMapTest{

    public static HashMap setKeyValue(HashMap h, String s1, String s2){
        h.put(s1,s2);
        return h;
    }

    public static void getCapital(HashMap h,String CountryName){
        System.out.println(h.get(CountryName));
    }

    public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
          if (hm.get(o).equals(value)) {
            return o;
          }
        }
        return null;
    }

    public static void getCountry(HashMap h,String capitalName){
        System.out.println(getKeyFromValue(h, capitalName));
        // BidiMap<String, String> bm = new DualHashBidiMap<>();
        // bm.putAll(h);
        // System.out.println(bm.getKey(capitalName));

    }

    public static HashMap copyHashMap(HashMap<String,String> h1,HashMap<String,String> h2){
        for(Map.Entry<String,String> m : h1.entrySet()){
            h2 = setKeyValue(h2, (String)m.getValue(), (String)m.getKey());
        }
        return h2;
    }

    public static void mapToList(HashMap h){
        List l = new ArrayList(h.entrySet());
        System.out.println(l);
    }

    public static void main(String[] args) {
        HashMap<String,String> h = new HashMap<String,String>();
        HashMap<String,String> h2 = new HashMap<String,String>();
        h = setKeyValue(h,"India","Delhi");
        h = setKeyValue(h,"Japan","Tokyo");
        h = setKeyValue(h,"West Bengal","Kolkata");
        h = setKeyValue(h,"Ahmedabad","Gandhinagar");
        System.out.println(h);
        getCapital(h, "India");
        getCountry(h, "Gandhinagar");
        // getCapital(h, "Tokyo");
        h2 = copyHashMap(h, h2);
        System.out.println(h2);
        mapToList(h);
    }
}