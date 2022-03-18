package com.revature.p0.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {
	public static void main(String[] args) {
		
	
	        String url = System.getenv("DB_URL");
	        System.out.println(url);
	        try {
	            // A factory - pass in string details for any type of database.
	            // The DriverManager factory will give you back a connection
	            // implementation specifically for Postgres.
	            Connection conn = DriverManager.getConnection(url);
	            System.out.println("Connected .....");
	           // return conn;
	        } catch (Exception e) {
	            e.printStackTrace();
	           // return null;
	        }
	    }
}
