package com.qsp.student_app;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	static Connection con=null;
	
	public static Connection connect()
	{
		try {
			//Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","root");
			
			System.out.println("connection sucessful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return con;
	}
}
