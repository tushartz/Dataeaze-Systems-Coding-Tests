package com.asign.demoT;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HSQLdbConnection {
   
   public static void main(String[] args) {
      
      Connection con = null;
      Statement stmt = null;
      int result = 0;
      
      try {
         Class.forName("org.hsqldb.jdbc.JDBCDriver");
         con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/testdb", "SA", "");
         stmt = con.createStatement();
         
         result = stmt.executeUpdate("CREATE TABLE dataeaze (id INT NOT NULL, date DATE NOT NULL, Startup_Name VARCHAR(20) NOT NULL, Industry_Vertical VARCHAR(50), SubVertical VARCHAR(50), City VARCHAR(50), Investors_Name VARCHAR(50), InvestmentnType VARCHAR(50), Amount_in_USD VARCHAR(50), Remarks VARCHAR(50), PRIMARY KEY (id));");
			
      }  catch (Exception e) {
         e.printStackTrace(System.out);
      }
      System.out.println("Table created successfully");
   }
}