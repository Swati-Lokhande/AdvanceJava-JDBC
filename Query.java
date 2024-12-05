package com.qsp.student_app;

public class Query {

	public static String insert="INSERT INTO studentdata(id,name,email) VALUES(?,?,?)";
	public static String update="UPDATE studentdata SET name=? WHERE id=?";
	public static String delete="DELETE FROM studentdata WHERE id=? ";
	public static String read="SELECT * FROM studentdata";

}
