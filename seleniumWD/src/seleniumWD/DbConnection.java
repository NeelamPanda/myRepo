package seleniumWD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","admin");
		Statement st=con.createStatement();
		
//		ResultSdret rs=st.executeQuery("select * from Employee");
//		while(rs.next()){
//		System.out.println(rs.getInt(1)+" "+ rs.getString(2) + " "+rs.getInt(3));
//	}
		String sql=" insert into Employee values(104,'ahs',120000,'lingampall')";
		int num=st.executeUpdate(sql);
		System.out.println("row inserted=" +num);
}

}
