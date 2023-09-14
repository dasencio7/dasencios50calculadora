package controlador;

import modelo.CalculadoraInteres;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ControladorCalculadoraInteres", urlPatterns = {"/calcular"})
public class ControladorCalculadoraInteres extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recuperar los parámetros del formulario
        double capital = Double.parseDouble(request.getParameter("capital"));
        double tasa = Double.parseDouble(request.getParameter("tasa"));
        int años = Integer.parseInt(request.getParameter("años"));

        // Calcular el interés simple utilizando el modelo
        double interes = CalculadoraInteres.calcularInteresSimple(capital, tasa, años);

        // Establecer el resultado como atributo en la solicitud
        request.setAttribute("interes", interes);

        // Redireccionar a la vista (JSP) para mostrar el resultado
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
