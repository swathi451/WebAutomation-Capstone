package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public String getProperty(String value) throws IOException {
       // System.out.println("user.dir");
        File f = new File("/Users/testvagrant/IdeaProjects/Automation/src/main/java/utilities/ConfigReader.java");
        FileInputStream st = new FileInputStream(f);
        Properties pt = new Properties();
        pt.load(st);
        String property=null;
        if (value.equalsIgnoreCase("browser")) {
            property = pt.getProperty("Browser");
        } else if (value.equalsIgnoreCase("url")) {
            property = pt.getProperty("Url");
        } else if (value.equalsIgnoreCase("implicitlywait")) {
            property = pt.getProperty("implicitlywait");
        } else if(value.equalsIgnoreCase("username")) {
            property = pt.getProperty("Username");
        } else if(value.equalsIgnoreCase("password")) {
            property = pt.getProperty("Password");
        }
        return property;


    }

}
