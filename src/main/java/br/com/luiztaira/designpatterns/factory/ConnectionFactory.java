package br.com.luiztaira.designpatterns.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * The design pattern factory is used to isolate the object creation in a unique point
 */
public class ConnectionFactory {

    public Connection getConnection(){
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");

            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
