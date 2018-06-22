package com.ds;

import java.sql.*;





public class Main {

    public static void main(String[] args) {
        String i = new String("Nothing");
        i = args[0];
        System.out.println(i);

        OracleDescription oracleDesc = new OracleDescription();
        System.out.println(oracleDesc.getDetails());


        Connection oracleConnection = null;

        try {
            oracleConnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }

        //Class.forName("oracle.jdbc.driver.OracleDriver");
    }
}

class OracleDescription {
    public String getDetails(){
        String text = "Oracle connection: ???";
        return text;
    };
}
