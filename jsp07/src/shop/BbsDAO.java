package shop;

import java.sql.*;

public class BbsDAO {

	public void create(BbsDTO dto) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
	
		String sql = "insert into bbs values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getUser());
		ps.executeUpdate();
		
		ps.close();
		con.close();
		
	}
	
	public void update(BbsDTO dto) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
	
		String sql = "update bbs set content = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(2, dto.getId());
		ps.setString(1, dto.getContent());
		ps.executeUpdate();
		
		ps.close();
		con.close();
		
	}

	public void delete(BbsDTO dto) throws Exception{
	
	Class.forName("com.mysql.jdbc.Driver");
	
	String url = "jdbc:mysql://localhost:3306/shop";
	String user = "root";
	String password = "1234";
	Connection con = DriverManager.getConnection(url, user, password);

	String sql = "delete from bbs where id = ?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, dto.getId());
	
	ps.executeUpdate();
	
	ps.close();
	con.close();
	
}

}
