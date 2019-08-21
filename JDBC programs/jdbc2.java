import java.sql.*;

public class jdbc2{

    public static void main(String[] args) {
        try{
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "cse");
            int choice = Integer.parseInt(args[0]);
            PreparedStatement st;
            Statement stmt;
            ResultSet rs;

            switch(choice){
                case 1:
                    int roll = Integer.parseInt(args[1]);
                    String name = args[2];
                    String stream = args[3];
                    String dob = args[4];
                    int fees = Integer.parseInt(args[5]);
                    System.out.println("Inserting.....");
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
                    int roll2 = Integer.parseInt(args[1]);
                    System.out.println("Deleting.....");
                    String query2 = "delete from student where roll = "+roll2;
                    st = con.prepareStatement(query2);
                    int count2 = st.executeUpdate();
                    System.out.println(count2+" row(s) deleted..");
                    break;
                case 3:
                    int roll3 = Integer.parseInt(args[1]);
                    int fees3 = Integer.parseInt(args[2]);
                    System.out.println("Updating.....");
                    String query3 = "update student set fees = ? where roll = ?";
                    st = con.prepareStatement(query3);
                    st.setInt(1, fees3);
                    st.setInt(2, roll3);
                    int count3 = st.executeUpdate();
                    System.out.println(count3+" row(s) updated..");
                    break;
                case 4:
                    if(args.length==1){
                        System.out.println("Displaying result.....\n");
                        String query4 = "select * from student";
                        stmt = con.createStatement();
                        rs = stmt.executeQuery(query4);
                        while(rs.next()){
                            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
                        }
                        break;
                    }
                    else{
                        int roll4 = Integer.parseInt(args[1]);
                        System.out.println("Displaying result.....\n");
                        String query4 = "select * from student where roll = ?";
                        st = con.prepareStatement(query4);
                        st.setInt(1, roll4);
                        rs = st.executeQuery();
                        while(rs.next()){
                        	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
                        }
                        break;
                    }
                default:
                    System.out.println("Try again.");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}