package com.bct.word.Processor.test;


import com.bct.word.Processor.output.*;
import java.sql.Statement;
import com.bct.word.Processor.input.*;


public class Assignment4 {

	public static void createTable() throws Exception{
			try {
			
				String create =("CREATE TABLE IF NOT EXISTS myfile(id int PRIMARY KEY auto_increment, fileName varchar(200) not null,timestamp TIMESTAMP not null,vowelValue varchar(10) not null,word varchar(70) not null)");
				Statement st=Dbconnection.getConnection().createStatement();
				st.execute(create);
				
			}catch(Exception e) {
				System.out.println(e);
			}finally {
				System.out.println("Table created successfully");
			}
		}
	


		
	 public static void main(String[] args) throws Exception { 
		 
			createTable();
			Input c=new Input();

			c.readFile("C:\\Users\\krithika\\Desktop\\sampleInput.txt");
		  }
}
