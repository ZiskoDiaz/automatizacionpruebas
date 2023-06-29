import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Aquí puedes agregar la lógica de validación con la base de datos
        // Por ejemplo, puedes usar JDBC para conectarte a una base de datos MySQL o MariaDB

        if (username.equals("usuario") && password.equals("contrasena")) {
            // Inicio de sesión exitoso
            response.sendRedirect("dashboard.jsp"); // Redirige al panel de control
        } else {
            // Credenciales inválidas
            response.sendRedirect("login.jsp?error=true"); // Redirige de vuelta al formulario con un mensaje de error
        }
    }
}
