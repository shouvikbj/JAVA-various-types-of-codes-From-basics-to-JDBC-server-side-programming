import java.util.*;

class hashSet{
    HashSet<String> hs = new HashSet<String>();
    void saveCountryName(String sc){
        hs.add(sc);
    }
    void getCountryName(String gc){
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            //String elem = itr.next();
            if(itr.next().equals(gc)){
                System.out.println(gc);
                // continue;
            }
            else{
                System.out.println("null");
                // continue;
            }
        }
    }
}

public class hashSetTest{
    public static void main(String[] args) {
        hashSet h1 = new hashSet();
        h1.saveCountryName("India");
        h1.saveCountryName("England");
        h1.saveCountryName("Bangladesh");

        h1.getCountryName("England");
        h1.getCountryName("India");
        h1.getCountryName("Ireland");
    }
}