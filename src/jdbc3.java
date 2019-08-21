import java.sql.*;
import java.util.*;

class jdbcQueue{
    public void createConnection(){
        try{
        Scanner input = new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "cse");
        PreparedStatement st;
        Statement stmt;
        ResultSet rs;
        System.out.println();
        System.out.println("1. Insert into Student DB : ");
        System.out.println("2. Delete from Student DB : ");
        System.out.println("3. Update fees : ");
        System.out.println("4. View whole data from Student DB : ");
        System.out.println("5. View details of a particular student : ");
        System.out.print("\nEnter your choice : ");
        int choice = input.nextInt();
        input.nextLine();
        switch(choice){
            case 1:
                System.out.print("Enter roll : ");
                int roll = input.nextInt();
                input.nextLine();
                System.out.print("Enter name : ");
                String name = input.nextLine();
                System.out.print("Enter stream : ");
                String stream = input.nextLine();
                System.out.print("Enter DOB [dd.mm.yyyy] : ");
                String dob = input.nextLine();
                System.out.print("Enter fees : ");
                int fees = input.nextInt();
                input.nextLine();
                System.out.println("\nInserting.....\n");
                String query1 = "insert into student values(?,?,?,?,?)";
                st = con.prepareStatement(query1);
                st.setInt(1, roll);
                st.setString(2, name);
                st.setString(3, stream);
                st.setString(4, dob);
                st.setInt(5, fees);
                int count1 = st.executeUpdate();
                System.out.println(count1+" row(s) inserted..");
                break;
            case 2:
                System.out.print("Enter roll to be Deleted : ");
                int roll2 = input.nextInt();
                input.nextLine();
                System.out.println("\nDeleting.....\n");
                String query2 = "delete from student where roll = "+roll2;
                st = con.prepareStatement(query2);
                int count2 = st.executeUpdate();
                System.out.println(count2+" row(s) deleted..");
                break;
            case 3:
                System.out.print("Enter roll : ");
                int roll3 = input.nextInt();
                input.nextLine();
                System.out.print("Enter new amount of fees : ");
                int fees3 = input.nextInt();
                input.nextLine();
                System.out.println("\nUpdating.....\n");
                String query3 = "update student set fees = ? where roll = ?";
                st = con.prepareStatement(query3);
                st.setInt(1, fees3);
                st.setInt(2, roll3);
                int count3 = st.executeUpdate();
                System.out.println(count3+" row(s) updated..");
                break;
            case 4:
                System.out.println("\nDisplaying result.....\n");
                String query4 = "select * from student";
                stmt = con.createStatement();
                rs = stmt.executeQuery(query4);
                while(rs.next()){
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
                }
                break;
            case 5:
                System.out.print("Enter roll : ");
                int roll5 = input.nextInt();
                input.nextLine();
                System.out.println("\nDisplaying result.....\n");
                String query5 = "select * from student where roll = ?";
                st = con.prepareStatement(query5);
                st.setInt(1, roll5);
                rs = st.executeQuery();
                while(rs.next()){
            	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
                }
                break;
            default:
                System.out.println("Try again..");
                break;
        }
        input.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }  
}

public class jdbc3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<jdbcQueue> queue = new ArrayList<jdbcQueue>();
        //System.out.print("How many Transactions do you want to make : ");
        //int num = input.nextInt();
        // for(int i=1; i<=num; i++){
            // jdbcQueue jq = new jdbcQueue(); 
        // }
        jdbcQueue jq1 = new jdbcQueue();
        jdbcQueue jq2 = new jdbcQueue();
        jdbcQueue jq3 = new jdbcQueue();
        jdbcQueue jq4 = new jdbcQueue();
        jdbcQueue jq5 = new jdbcQueue();

        queue.add(jq1);
        queue.add(jq2);
        queue.add(jq3);
        queue.add(jq4);
        queue.add(jq5);

        Iterator<jdbcQueue> itr = queue.iterator();
        while(itr.hasNext()){
            itr.next().createConnection();
        }

        // for(jdbcQueue jq : queue){
        //     jq.createConnection();
        // }
        input.close();
    }
}