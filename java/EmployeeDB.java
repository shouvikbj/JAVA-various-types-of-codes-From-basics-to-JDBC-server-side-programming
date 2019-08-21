import java.util.*;

class Employee{
int empId;
String empName;
String email;
String gender;
float salary;

void getEmployeeDetails(){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the Employee ID :");
empId=sc.nextInt();
System.out.println("Enter the Employee Name :");
empName=sc.next();
System.out.println("Enter the Employee emailId :");
email=sc.next();
System.out.println("Enter the Employee Gender :");
gender=sc.next();
System.out.println("Enter the Employee Salary :");
salary=sc.nextFloat();
}
}

public class EmployeeDB{

ArrayList<Employee> list=new ArrayList<Employee>();

public boolean addEmployee(Employee e){

boolean bx=false;
try
{
list.add(e);
bx=true;
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
bx=false;
}
return bx;
}


boolean deleteEmployee(int empId){
boolean bx = false;

Iterator<Employee> itr =  list.iterator(); 
        while (itr.hasNext()) 
        { 
            Employee eid = (Employee)itr.next(); 
            if (eid.empId == empId) 
		{
                itr.remove(); 
		bx=true;
		}
        } 

return bx;
}

String showPaySlip(int empId){


String result="";

for(Employee ex : list)
{
	if(ex.empId == empId)
	{
	result = " NAME :" + ex.empName + " Email : " + ex.email + " GENDER : " + ex.gender + " SALARY : " + ex.salary; 	
	}
}

return result;


}



public static void main(String[] args){

char chx=' ';

EmployeeDB obj = new EmployeeDB();

System.out.println("Total Number of Employees to enter : ");
int t = (new Scanner(System.in).nextInt());

for(int k=1;k<=t;k++)
{
Employee objx = new Employee();
objx.getEmployeeDetails();
boolean bx = obj.addEmployee(objx);
if(bx)
System.out.println("Employee Added.");
}
System.out.println("\n DETAILS ARE SAVED SUCCESSFULLY.\n");


do
{
System.out.println("Enter Employee ID");
int dx = (new Scanner(System.in).nextInt());

System.out.println(" SELECT ANY OPERATION > ");
System.out.println(" 1. TO DELETE EMPLOYEE DETAILS.");
System.out.println(" 2. SHOW EMPLOYEE PAY SLIP.");

System.out.println("Enter Choice: ");
int ch = (new Scanner(System.in).nextInt());

if(ch==1)
{
boolean nnx= obj.deleteEmployee(dx);
if(nnx)
System.out.println("Details deleted.");
else
System.out.println("Unable to delete the Details.");
}
else if(ch==2)
{
String result = obj.showPaySlip(dx);
	if(!result.equals(""))
	{
	System.out.println("PAYSLIP Details are : " );
	System.out.println(result);
	}
	else
	{
	System.out.println("ID NOT FOUND.");
	}
}
else
{
System.out.println("INVALID CHOICE ENTERED. TRY AGAIN. ");
}


System.out.println("Do you want to quit (y/n) ?");
chx = (new Scanner(System.in).nextLine()).charAt(0);
}//end do
while(chx == 'n');


}
}