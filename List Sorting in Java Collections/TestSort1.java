import java.util.*;

// Sorting done in ""Ascending order"" of Salary..

class Employee implements Comparable<Employee>{
    int eId;
    String eName;
    int salary;
    Employee(int eId, String eName, int salary){
        this.eId = eId;
        this.eName = eName;
        this.salary = salary;
    }
    public int compareTo(Employee e){
        if(salary==e.salary)
            return 0;
        else if(salary > e.salary)
            return 1;
        else
            return -1;
    }
}

public class TestSort1{
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(100, "Shouvik", 500));
        al.add(new Employee(200, "Bajpayee", 600));
        al.add(new Employee(150, "Shouvik Bajpayee", 200));
        al.add(new Employee(250, "Piku", 550));

        Collections.sort(al);
        
        for(Employee e:al){
            System.out.println(e.eId+" "+e.eName+" "+e.salary);
        }
    }
}