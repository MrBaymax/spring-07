package jdbc_test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) {
		//数据库连接&&查询
		/*String url="jdbc:mysql://192.168.80.131:3306/db2";
		String user="root";
		String password = "123456";
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement("select * from student where id=?");
			ps.setInt(1, 1);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+"  "+rs.getString("name"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(rs!=null)
						rs.close();
					if(ps!=null)
						ps.close();
					if(con!=null)
						con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}*/	
		//数据库连接&&修改
		
	}
}
