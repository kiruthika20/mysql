package com.bct.word.Processor.input;


import com.bct.word.Processor.engine.*;


public class Input {
public void readFile(String infName) throws Exception {
Vowelprocess process=new Vowelprocess();
process.readFile(infName);

}
public static void main(String[] args) throws Exception { 
	 
	
	Input c=new Input();

	c.readFile("C:\\Users\\krithika\\Desktop\\sampleInput.txt");
  }
}

