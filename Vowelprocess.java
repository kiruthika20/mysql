package com.bct.word.Processor.engine;



import java.io.File;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

import com.bct.word.Processor.output.Dbconnection;

public class Vowelprocess extends Dbconnection{

public void readFile(String infName) throws Exception {
char[] vowels = {'a', 'e', 'i', 'o', 'u'};

try {

       File myObj= new File(infName);
       
       Scanner myReader = new Scanner (myObj);

       Path path = Paths.get(infName);  
       Path fileName = path.getFileName(); 
       String FILENAME = fileName.toString();
       
       Date date = new Date();
       Timestamp timestamp=new Timestamp(date.getTime());
      

        while (myReader. hasNextLine()) 
        {

           String data = myReader.nextLine();
           String[] inputArray=data.split(" ");
              for(String s:inputArray)
                  if(s.length()>1) 
                  {
                    for(int i = 0;i<vowels.length; i++)
                       {
                         if(s.charAt(1)==vowels[i]) 
                         {
                           
                              {
	                               
	                          Connection con=getConnection();
	                          String query = " insert into myfile (fileName,timestamp,vowelValue,word)"
		                      + " values ('"+FILENAME+"','"+timestamp+"','"+s.charAt(1)+"','"+s+"')";
	                          Statement st=con.createStatement();
	                          st.execute(query);

                             }
                        }

                     }
             }
          }

                   myReader.close();
                

       } catch (Exception e) 
           {
         System.out.println(e);
  
           }
       }


  }


