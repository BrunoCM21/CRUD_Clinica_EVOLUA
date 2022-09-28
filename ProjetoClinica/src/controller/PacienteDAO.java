package controller;

import java.awt.HeadlessException;
import model.Paciente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PacienteDAO {
    
    private Connection conexao;
    private PreparedStatement cmd;

    public PacienteDAO() {
        this.conexao = Conexao.ConectarBD();
    }
    
    public int inserePaciente(Paciente p) {
        try {
            String sql = "insert into paciente(nome, peso, altura) values (?,?,?)";
            cmd = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, p.getNome());
            cmd.setDouble(2, p.getPeso());
            cmd.setDouble(3, p.getAltura());
            
            if(cmd.executeUpdate() > 0) {
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next() ? rs.getInt(1) : -1;
                
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("ERRO" + e.getMessage());
            return -1;
        } finally {
            Conexao.DesconectarBD(conexao);
        }
    }
    
    public int deletaPaciente(Paciente p) {
        try {
            String sql = "delete from paciente where id = ?";
            cmd = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            cmd.setInt(1, p.getId());
            cmd.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso.");
        } catch(SQLException sqlE) {
            System.out.println("ERRO" + sqlE.getMessage());
            return -1;
        } catch(HeadlessException he) {
            System.out.println("ERRO" + he.getMessage());
            return -1;
        } catch(Exception e) {
            System.out.println("ERRO" + e.getMessage());
            return -1;
        } finally {
            Conexao.DesconectarBD(conexao);
        }
        return 0;
    }
    
    public List<Paciente> listaPacientes() {
        List<Paciente> lista = new ArrayList<Paciente>();
        try {
            String sql = "select * from paciente";
            cmd = conexao.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()) {
                Paciente p = new Paciente();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setPeso(rs.getDouble("peso"));
                p.setAltura(rs.getDouble("altura"));
                
                lista.add(p);
            }
            return lista;
        } catch(SQLException e) {
            System.out.println("ERRO" + e.getMessage());
            return null;
        } finally {
            Conexao.DesconectarBD(conexao);
        }
    }
}
