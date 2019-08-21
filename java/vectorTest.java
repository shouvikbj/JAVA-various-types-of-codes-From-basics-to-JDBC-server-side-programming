import java.util.*;

public class vectorTest{
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.addElement("Jan");
        v.addElement("Feb");
        v.addElement("Mar");
        v.addElement("Apr");
        v.addElement("May");
        v.addElement("Jun");
        v.addElement("Jul");
        v.addElement("Aug");
        v.addElement("Sep");
        v.addElement("Oct");
        v.addElement("Nov");
        v.addElement("Dec");

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.print(e.nextElement()+" ");
        }
    }
}