package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        String nomeUsuario = "msilva";
        String senhaUsuario = "i2#Bu94iL";
        String endereçoSdervidor = "localhost";
        String nomeBanco = "mydb";
        try {
            return DriverManager.getConnection("jdbc:mysql://" + endereçoSdervidor + "/" + nomeBanco, nomeUsuario, senhaUsuario);
        } catch (SQLException e) {
            System.out.println("Falha na Conexão");
            throw new RuntimeException(e);
        }


    }
}
