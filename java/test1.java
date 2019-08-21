import java.util.*;

class test1{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jan");
        list.add("Feb");
        list.add("Mar");
        list.add("Apr");
        list.add("May");
        list.add("Jun");
        list.add("Jul");
        list.add("Aug");
        list.add("Sep");
        list.add("Oct");
        list.add("Nov");
        list.add("Dec");
        // System.out.println(list);
        // Iterator itr = list.iterator();
        // while (itr.hasNext()) {
            // System.out.print(itr.next());
        for(String str:list){
            System.out.print(str+" ");
        }
        //}
    }
}