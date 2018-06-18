package br.com.industrial.aulacrud.dao.impl;

import br.com.industrial.aulacrud.bean.Aluno;
import br.com.industrial.aulacrud.dao.AlunoDAO;
import br.com.industrial.aulacrud.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoDAOImpl implements AlunoDAO {

    @Override
    public Aluno get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> get(String nome) {
        List<Aluno> alunos = new ArrayList<>();
        Connection con = null;
        try {
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement("SELECT id, nome, idade FROM Alunos WHERE nome LIKE ?");
            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Aluno a = new Aluno(rs.getInt("Id"),
                        rs.getString("nome"), rs.getInt("idade"));
                alunos.add(a);
            }
        } catch (SQLException ex) {
            try {
                if(con != null)
                    con.rollback();
            } catch (SQLException ex1) {
            }
        } finally {
            try {
                if(con != null)
                    con.commit();
            } catch (SQLException ex) {
            }
        }

        return alunos;
    }

    @Override
    public void delete(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno save(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
