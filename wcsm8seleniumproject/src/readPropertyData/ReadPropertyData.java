package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./Data/config.properties");//provide the path of 
		
		//read the data from property file
		
		Properties prop = new Properties();
		
	   prop.load(fis);		//name the property file for read
	   
	  String un = prop.getProperty("browser");
	  
	  System.out.println(un);
	}

}
