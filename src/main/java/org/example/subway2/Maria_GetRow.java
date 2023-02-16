package org.example.subway2;

import java.sql.*;

public class Maria_GetRow
{
    public static void main(String[] args)
    {
    	MariadbData MDB=new MariadbData();
       Connection dbCon = null;
       Statement stmt = null;
       ResultSet rs = null;
       //臱笆祘Α把计
//       String sDriver = "com.mariadb.jdbc.Driver";
        String sDriver="com.mysql.cj.jdbc.Driver";
       String user     = "root";
       String password = "!QAZ1qaz";
//       String url      = "jdbc:mariadb://localhost/mydb";
        String url="jdbc:mysql://localhost:3306/subway?useSSL=false";
       
       try{   //更JDBC driver 
            
           Class.forName(sDriver);
       }
       catch(Exception e){
       
           System.out.println("礚猭更臱笆祘Α--------");
           return;
       }
       
       try{   
       
           dbCon = DriverManager.getConnection(url,user,password);
           stmt = dbCon.createStatement();
       }
       catch(SQLException e){

           System.out.println(e.getMessage());
           System.out.println("XXXXXXXOOOOXX");
           return;
       }
       
       
       
       
//       try{ 
//           rs = stmt.executeQuery("SELECT * FROM employee");
//           MDB.add(rs);
//           }
//         catch(SQLException e){}
//       
//       
//       try{ 
//           rs = stmt.executeQuery("SELECT * FROM employee");
//           MDB.delete(rs);
//           }
//         catch(SQLException e){}
//       
//       try{ 
//           rs = stmt.executeQuery("SELECT * FROM employee");
//           MDB.fixed(rs);
//           }
//         catch(SQLException e){}
       
       
       try{
           System.out.println("XXXXXXXOOOOXX");
       rs = stmt.executeQuery("SELECT * FROM employee");
       MDB.show(rs);
       }
     catch(SQLException e){

         System.out.println("------------");
     }

       
       try{
        
             stmt.close(); 
             dbCon.close(); 
       }
       catch( SQLException e ){}
    }
}
