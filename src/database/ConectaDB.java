package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectaDB {

    private Connection conexao;

    public Connection Conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mini_estoque?" + "user=root&password=Senai1234&" + "useSSL=false&useTimezone=true&serverTimezone=UTC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao servidor!");
        }
        return conexao;
    }
}
