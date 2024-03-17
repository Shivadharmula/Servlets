package com.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insert {
	
	public static void method(Test ts) throws SQLException {
		  Connection connection = null;
          PreparedStatement statement = null;
          ResultSet resultset = null;
          
     	 String url="jdbc:mysql://192.168.0.145/test_main";
		 String userName= "root";
		 String password="root";
		 String insertQuery ="insert  into info(Fname,Lname,Email,Password)"
				+"values(?,?,?,?)";
		 try
		 {
			// Class.forName("com.mysql.jdbc.Drivers");
			 connection=DriverManager.getConnection(url, userName, password);
				statement=connection.prepareStatement(insertQuery);
				statement.setString(1,ts.getFname());
	            statement.setString(2,ts.getLanme());
	            statement.setString(3,ts.getEmail());
	            statement.setString(4,ts.getPassword());
	           
	            
	            int noofRows = statement.executeUpdate();
	            System.out.println(noofRows);
	          
	            
	         
//			resultset=statement.executeQuery(query);
//				while(resultset.next())
//				{
//					System.out.println(resultset.getString("nameoftheparty"));
//				
//				}
//				
				}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
