package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConnectionFactory {

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String banco = "jdbc:mysql://localhost:3306/retaguarda";
    private static final String user = "root";
    private static final String senha = "ifsc";  ///meu mysql nao tem senha configuarada para entrar - se tiver, alterar

    public static Connection getConnection() {
        //MysqlDataSource mySqlDataSource;
        try {
            return DriverManager.getConnection(banco + "?verifyServerCertificate=false"
                    + "&useSSL=false"
                    + "&requireSSL=false"
                    + "&USER=" + user + "&password=" + senha
                    + "&serverTimezone=UTC");
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void closeConnection(Connection conexao) {
        try {
            conexao.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void closeConnection(Connection conexao, PreparedStatement pstm) {
        try {
            pstm.close();
            conexao.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void closeConnection(Connection conexao, PreparedStatement pstm, ResultSet rst) {
        try {
            pstm.close();
            rst.close();
            conexao.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
