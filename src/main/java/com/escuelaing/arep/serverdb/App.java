package com.escuelaing.arep.serverdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {  
            Class.forName("org.postgresql.Driver");
            String host = "ec2-35-168-54-239.compute-1.amazonaws.com";
            String db = "d8g67as15jh72k";
            String user = "wwycfalrdvlodn";
            String passwd = "a6d4b6436e88f6fee723d67818cc6c4a83576b2bfe73fe66f7793e0f70ddef4d";
            Connection con = DriverManager.getConnection( "jdbc:postgresql://"+ host + ":" + port + "/" + db, user, passwd);
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from test");
            while(rs.next())  
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
            con.close();  
        } catch(Exception e) { 
            System.out.println(e);
        }
    }
}
