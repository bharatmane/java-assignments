package com.bharatmane.genericsdemo;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;


class UserDAOTest {
	@Test
	void mainMethodTest() {
		boolean output = false;
		try  
		{
		File file=new File("src/main/java/com/bharatmane/genericsdemo/dao/UserDao.java");    //creates a new file instance
		//file.getAbsoluteFile();
		FileReader fr=new FileReader(file);   //reads the file  
		BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
		StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
		String line;  
		while((line=br.readLine())!=null)  
		{  
			if(line.contains("UserDao<T>")) {
				output = true;
				break;
			}
							
		}  
		fr.close();    //closes the stream and release the resources  
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}
		assertTrue(output,"UserDAO should be of Generics Type");
	}
}