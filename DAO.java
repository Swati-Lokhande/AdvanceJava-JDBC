package com.qsp.student_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {

	public static void createStudent(StudentData studentData) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DB.connect();
		String query=Query.insert;
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1,studentData.getId());
		ps.setString(2,studentData.getName());
		ps.setString(3,studentData.getEmail());
		ps.executeUpdate();
		ps.close();
		System.out.println("Student added successfully: " + studentData);

	}
	
	public static ArrayList<StudentData>readAllStudentdata() throws SQLException
	{
		ArrayList<StudentData> studentList=new ArrayList<StudentData>();
		Connection connection=DB.connect();
		String query=Query.read;
		Statement statement=connection.createStatement();
		System.out.println("\n st= "+statement);
		ResultSet rs=statement.executeQuery(query);
		
		while(rs.next())
		{
			StudentData studentData=new StudentData();
			studentData.setId(rs.getInt("id"));
	        studentData.setName(rs.getString("name"));
	        studentData.setEmail(rs.getString("email"));
	        
			studentList.add(studentData);
		}
		rs.close();
		statement.close();
		return studentList;
	}

	public static void updateStudentData(StudentData updatestudentData) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con=DB.connect();
		String query=Query.update;
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,updatestudentData.getName());
		ps.setInt(2,updatestudentData.getId());
		
		ps.execute();
		System.out.println("updated sucessfully");
		con.close();
	}

	public static void deleteDataUsingId(StudentData deleteStudentData) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DB.connect();
		String query=Query.delete;
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, deleteStudentData.getId());
		ps.execute();
		System.out.println("Deleted Student Data Sucessfully");
		con.close();
	}

}
