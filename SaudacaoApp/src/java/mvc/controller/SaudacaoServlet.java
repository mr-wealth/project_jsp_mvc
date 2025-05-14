package mvc.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/saudacao")
public class SaudacaoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        if (nome == null || nome.trim().isEmpty()) {
            nome = "Visitante";
        }
        request.setAttribute("nome", nome);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
