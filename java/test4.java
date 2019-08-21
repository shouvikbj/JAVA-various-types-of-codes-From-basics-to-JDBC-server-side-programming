import java.util.*;
import java.io.*;

public class test4 {

    static boolean isNumber(String s) 
    { 
        for (int i = 0; i < s.length(); i++) 
        if (Character.isDigit(s.charAt(i))  
            == false) 
            return false; 
  
        return true; 
    } 
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        ArrayList al = new ArrayList();

        for(int i=0; i<4; i++){
            String in = sc.nextLine();
            if(isNumber(in))
                al.add(in);
            else
                continue;
        }

        // al.add("Java4s");
        // al.add(12);
        // al.add(12.54f);

        // for(int i=0;i<al.size();i++)
        // {
        //     Object o = al.get(i);

        //     if(o instanceof String)
        //         continue;
        //     System.out.println("Value is "+o.toString());    
        // }
        System.out.println(al);

    }
}