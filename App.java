package com.qsp.student_app;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws SQLException {
		
		while(true)
		{
			System.out.println("welcome to student data management app!");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter choice");
			System.out.println("1. insert  2. Read  3.Update 4.Delete 5.Exit");
			int ch=sc.nextInt();
			
			if(ch<1 ||ch>=5) break;
			
			switch(ch)
			{
			case 1:System.out.println("Enter id");
					int id=sc.nextInt();
					sc.nextLine(); // Consume leftover newline
					System.out.println("Enter name");
					String name=sc.nextLine();
					System.out.println("Enter email");
					String email=sc.nextLine();
					StudentData studentData=new StudentData(id,name,email);
					DAO.createStudent(studentData);
					break;
					
			case 2:ArrayList<StudentData> List=DAO.readAllStudentdata();
					for(StudentData student:List)
					{
						System.out.println(student);
					}
					break;
					
			case 3:System.out.println("Enter id");
					int id1=sc.nextInt();
					sc.nextLine(); 
					System.out.println("Enter the name to update");
					String updateName=sc.nextLine();
					StudentData updatestudentData=new StudentData(id1,updateName);
					DAO.updateStudentData(updatestudentData);
					break;
			
			case 4: System.out.println("Enter the id to delete data");
					int id2=sc.nextInt();
					StudentData deleteStudentData=new StudentData(id2);
					DAO.deleteDataUsingId(deleteStudentData);
					break;
					
			default:
					System.out.println("Invalid choice!");
			}
		}
	}
}
