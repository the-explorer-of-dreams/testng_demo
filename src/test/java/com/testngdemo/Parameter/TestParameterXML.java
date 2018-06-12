package com.testngdemo.Parameter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.print.DocFlavor;

public class TestParameterXML {

    Connection con;

    @Test
    @Parameters({ "dbconfig", "poolsize" })
    public void createConnection(String dbconfig, int poolsize) {

        System.out.println("dbconfig : " + dbconfig);
        System.out.println("poolsize : " + poolsize);

        Properties prop = new Properties();
        InputStream input = null;

        try {
            // get properties file from project classpath
            String path =this.getClass().getResource("/").getPath()+dbconfig;
            System.out.println("path => "+path);

            prop.load(new FileInputStream(path));

            String drivers = prop.getProperty("jdbc.driver");
            String connectionURL = prop.getProperty("jdbc.url");
            String username = prop.getProperty("jdbc.username");
            String password = prop.getProperty("jdbc.password");

            System.out.println("drivers : " + drivers);
            System.out.println("connectionURL : " + connectionURL);
            System.out.println("username : " + username);
            System.out.println("password : " + password);

            Class.forName(drivers);
            con = DriverManager.getConnection(connectionURL, username, password);

        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    //e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void getFilePath(){
        String path1 = this.getClass().getResource("/").getPath();
        System.out.println("this.getClass().getResource(\"/\").getPath()="+path1);
        String path2 = this.getClass().getResource("").getPath();
        System.out.println("this.getClass().getResource(\"\").getPath()="+path2);
        URL path3 = this.getClass().getClassLoader().getResource("testng.xml");
        System.out.println("this.getClass().getClassLoader().getResource(\"testng.xml\")="+path3);
        System.out.println("System.getProperty(\"user.dir\")="+System.getProperty("user.dir"));
        System.out.println( "System.getProperty(\"java.class.path\")="+System.getProperty("java.class.path"));
    }

}
