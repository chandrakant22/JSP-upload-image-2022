package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImageTblDao {
	private String db="jspimage";
	private String url="jdbc:mysql://localhost:3306/"+db;
	private String uname="root";
	private String pass="abc123";
	private Connection con;
	
	private Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(url,uname,pass);
		return con;
	}
	
	public int SaveName(String imageFileName) throws ClassNotFoundException, SQLException
	{
		String sql="insert into image_tbl (imageName) values(?)";
		PreparedStatement ps=getConnection().prepareStatement(sql);
		ps.setString(1,imageFileName);
		
		return ps.executeUpdate();
	}
	
	
	public List<ImageTbl> getAllImage() throws ClassNotFoundException, SQLException
	{
		String sql="SELECT * FROM image_tbl";
		PreparedStatement ps=getConnection().prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		
		List<ImageTbl> imageList=new ArrayList<ImageTbl>();//il imageList
		
		
		while(rs.next())
		{
			ImageTbl it =new ImageTbl();
			it.setId(rs.getInt(1));
			it.setImageName(rs.getString(2));
			
			imageList.add(it);
		}
		
	
		return imageList;
	}
	
}
