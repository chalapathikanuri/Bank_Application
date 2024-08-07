package Com.Bank_Application;

import java.util.Properties;
import java.io.FileInputStream;

public class PropertyManager {
	static String getProperty(String property) {
		String value="";
		Properties prop=new Properties();
		try {
			FileInputStream file=new FileInputStream("Config.properties");
			prop.load(file);
			value=prop.getProperty(property);
		}
		catch(Exception e)
		{
			
		}
		return value;
		
	}

}
