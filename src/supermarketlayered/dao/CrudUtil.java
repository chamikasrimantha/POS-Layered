/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import supermarketlayered.db.DBConnection;
/**
 *
 * @author HP
 */
public class CrudUtil {
    private static PreparedStatement getPreparedStatement(String sql, Object... args) throws SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        if(args !=null){
            for (int i = 0; i < args.length; i++) {
                statement.setObject(i+1, args[i]);
            }
        }
        
        return statement;
    }
    
    public static boolean executeUpdate(String sql, Object... args) throws SQLException{
        return getPreparedStatement(sql, args).executeUpdate()>0;
    }
    
    public static ResultSet executeQuery(String sql, Object... args) throws SQLException{
        return getPreparedStatement(sql, args).executeQuery();
    }
}
