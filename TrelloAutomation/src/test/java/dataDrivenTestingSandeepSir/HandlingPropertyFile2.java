package dataDrivenTestingSandeepSir;

import java.io.FileInputStream;
import java.util.Properties;               

public class HandlingPropertyFile2 {       
	public static void main(String[] args) throws Throwable {
		
		//Get the java representative object of the Physical File
		//FileInputStream fis=new FileInputStream("./src/test/resources/commondata.property");
		//FileInputStream fis=new FileInputStream("C:\\Users\\91738\\Desktop\\Rishav\\TrelloAutomation\\src\\test\\resources\\commondata.property");
		FileInputStream fis=new FileInputStream("C:\\Users\\91738\\Desktop\\commondata.property");
	

		//Create an Object of Properties Class
		Properties p=new Properties();
		
		//Load the File
		p.load(fis);
		
		//Get the data(value) using the Key
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw =p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
	}

}
