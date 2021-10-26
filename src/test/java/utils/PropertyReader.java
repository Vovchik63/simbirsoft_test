package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    private static String getPropertyFromFile(String propertyName){
        Properties properties = new Properties();
        try(InputStream inputStream = new FileInputStream("src/test/resources/framework.properties")){
            properties.load(inputStream);;

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return properties.getProperty(propertyName);
    }
    private static String getProperty(String propertyName){
        if(System.getProperty(propertyName) == null){
            return getPropertyFromFile(propertyName);
        }else {
            return System.getProperty(propertyName);
        }


    }
    public static String getURL(){
        return getProperty("url");
    }
    public static String getLogin(){
        return getProperty("login");
    }
    public static String getPassword(){
        return getProperty("password");
    }



}
