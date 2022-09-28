package controller;

import java.sql.*;

public class Conexao {

    private static final String DATABASE = "clinica";
    private static final String HOST = "jdbc:mysql://localhost:3306/" + DATABASE;
    private static final String URL = HOST;
    private static final String USUARIO = "root";
    private static final String SENHA = "admin";

    // Método p/ conectar ao BD
    public static Connection ConectarBD() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e);
            return null;
        }
    }

    // Método p/ desconectar ao BD
    public static void DesconectarBD(Connection conexao) {
        try {
            if(conexao != null) {
                conexao.close();
            }
        } catch (SQLException e) {
            System.err.println(e);
                
        }
    }
    
    public static void main(String[] args) {
        if (ConectarBD() != null) {
            System.out.println("Conectado com Sucesso.");
        } else {
            System.out.println("Falha ao Conectar.");
        }
    }

}
