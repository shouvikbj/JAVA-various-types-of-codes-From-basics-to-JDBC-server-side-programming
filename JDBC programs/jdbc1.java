import java.sql.*;

public class jdbc1{
    public static void main(String[] args) {
        try{
            //step 1: Load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //step 2: Create the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "cse");
            //step 3: Create the statement object
            Statement stmt = con.createStatement();
            //step 4: Execute query
            // ResultSet rs2 = stmt.executeQuery("insert into emp values(102,'Piku',21)");
            // ResultSet rs3 = stmt.executeQuery("delete from emp where id=101");
            ResultSet rs = stmt.executeQuery("select * from emp");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }
            rs.close();
            // rs2.close();
            // rs3.close();
            stmt.close();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}