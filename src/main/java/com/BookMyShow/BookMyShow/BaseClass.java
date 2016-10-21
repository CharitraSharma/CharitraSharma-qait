package com.BookMyShow.BookMyShow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseClass {

	InputStream inputstream ;
    Properties prop = new Properties();
    
    //method to get values of config.property file
    public String getPropValues(String string) throws IOException{
        try {
            
            String propFileName = "config.properties";
            inputstream = new FileInputStream(propFileName); 
            if(inputstream != null)
            {
                prop.load(inputstream);
               
            }
            else {
                throw new FileNotFoundException("Property file "+propFileName+" not found");
            }
                       
         
       
        } catch (Exception e) {
            System.out.println("Exception : " +e);
        }
        finally
        {
            inputstream.close();
        }
		return prop.getProperty(string);
        
    }


}
