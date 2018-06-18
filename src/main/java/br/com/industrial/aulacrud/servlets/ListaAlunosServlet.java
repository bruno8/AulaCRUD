package br.com.industrial.aulacrud.servlets;

import br.com.industrial.aulacrud.bean.Aluno;
import br.com.industrial.aulacrud.dao.AlunoDAO;
import br.com.industrial.aulacrud.dao.impl.AlunoDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ListaAlunoServlet", urlPatterns = {"/ListaAlunoServlet"})
public class ListaAlunosServlet extends HttpServlet {
    
    private String nomePesquisado;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        nomePesquisado = request.getParameter("nome");

        AlunoDAO alunoDAO = new AlunoDAOImpl();
        request.setAttribute("alunos", alunoDAO.get(nomePesquisado));
        request.setAttribute("nomePesquisado", nomePesquisado);

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
