/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ardya
 */
public class ModelMain {
    Statement statement;

    public String[][] logIn(String Username, String Password){
        try{
            int jmlData = 0;

            String data[][] = new String[1][3]; //baris, kolom nya ada 3
            String query = "Select * from`user` WHERE `username` = '"+ Username +"' AND `password` = '"+ Password +"'";
            statement = JavaDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ //lanjut kedata selanjutnya jmlData bertambah
                data[0][0] = resultSet.getString("id_user"); //kolom nama harus sama besar kecilnya dgn database
                data[0][1] = resultSet.getString("username");
                data[0][2] = resultSet.getString("password");
                jmlData++; //barisnya berpindah terus
            }
            return data;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
}
