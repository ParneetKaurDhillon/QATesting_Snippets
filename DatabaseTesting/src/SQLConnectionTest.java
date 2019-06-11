import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnectionTest {

	public static void main(String[] args) {
		
		try {

			Connection conn = DriverManager.getConnection("JDBC:mysql://localhost:3306/myselenium_db1", "root", "admin");
			Statement st = conn.createStatement();
			String queryInsert = "Insert into employeecredentials values ('7','DEF','PWD7')";
			
			ResultSet rs ;
			int s = st.executeUpdate(queryInsert);
			// select all values
			rs = st.executeQuery("select * from employeecredentials");
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			System.out.println("String printing >"+s);
			rs.close();
			st.close();
			conn.close();
		}catch(SQLException e){
			System.out.println(e);
		}
	}
}
