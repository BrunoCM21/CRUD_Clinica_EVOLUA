package controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class UsuarioDAO {
    
    private Connection conexao;
    private PreparedStatement cmd;
    
    public UsuarioDAO() {
        this.conexao = Conexao.ConectarBD();
    }
    
    public Usuario executaLogin(String email, String senha) {
        try {
            String sql = "select * from usuario where email = ? and senha = ?";
            this.cmd = conexao.prepareStatement(sql);
            cmd.setString(1, email);
            cmd.setString(2, senha);
            ResultSet rs = cmd.executeQuery();
            if(rs != null && rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setEmail(rs.getString("email"));
                u.setSenha(rs.getString("senha"));
                return u;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro encontrado: " + e);
            return null;
        } finally {
            Conexao.DesconectarBD(conexao);
        }
    }
    
    public Usuario insereUsuario(String email, String senha) {
        try {
            String sql = "insert into usuario (email, senha) values (?, ?)";
            
            cmd = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, email);
            cmd.setString(2, senha);

            if(cmd.executeUpdate() > 0) {
                ResultSet rs = cmd.getGeneratedKeys();
                if(rs.next()) {
                    Usuario u = new Usuario();
                    u.setId(rs.getInt(1));
                    u.setEmail(email);
                    u.setSenha(senha);
                    return u;
                }
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro encontrado: " + e);
            return null;
        } finally {
            Conexao.DesconectarBD(conexao);
        }
        return null;
    }
    
    public List<Usuario> pesquisaEmailUsuario(String email) {
        List<Usuario> listaUser = new ArrayList<Usuario>();
        try {
            String sql = "select * from usuario where email = ?";
            
            cmd = conexao.prepareStatement(sql);
            cmd.setString(1, email);
            
            ResultSet rs = cmd.executeQuery();
            if(rs != null) {
                while(rs.next()) {
                    Usuario u = new Usuario();
                    u.setId(rs.getInt("id"));
                    u.setEmail(rs.getString("email"));
                    u.setSenha(rs.getString("senha"));
                    rs.getString("email");
                    listaUser.add(u);
                }
            }   
        } catch (SQLException e) {
            System.out.println("Erro encontrado: " + e);
        } finally {
            Conexao.DesconectarBD(conexao);
        }
        return listaUser;
    }

    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    public PreparedStatement getCmd() {
        return cmd;
    }

    public void setCmd(PreparedStatement cmd) {
        this.cmd = cmd;
    }  
}
