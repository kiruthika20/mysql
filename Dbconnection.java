package com.bct.word.Processor.output;

import java.sql.Connection;
import java.sql.DriverManager;


public class Dbconnection {
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljava","root","mmmm");
    	return con;
	
}
}

	