import java.util.*;

class treeSet{
    TreeSet<String> ts = new TreeSet<String>();
    void saveCountryName(String sc){
        ts.add(sc);
    }
    void getCountryName(String gc){
        Iterator itr = ts.iterator();
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

public class treeSetTest{
    public static void main(String[] args) {
        treeSet t1 = new treeSet();
        t1.saveCountryName("India");
        t1.saveCountryName("England");
        t1.saveCountryName("Bangladesh");

        t1.getCountryName("England");
        t1.getCountryName("India");
        t1.getCountryName("Ireland");
    }
}