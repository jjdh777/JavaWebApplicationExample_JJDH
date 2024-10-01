package ejemplos.servlet.curso;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Ejemplo Servlet</h1>");
		out.println("<p>Este es un ejemplo en el curso de Java para generar HTML desde un Servlet.</p>");
		out.println("<p><a href=\"/myServlet2\">Vamos al otro Servlet</a></p>");
		out.println("</body></html>");

		// Ejercicio: incluir un formulario

		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Ejemplo de Formulario HTML</h2>");
		out.println("<form action='/myServlet2' method='post'>");
		out.println("<label for='nombre'>Nombre:</label><br>");
		out.println("<input type='text' id='nombre' name='nombre' value='Jesús'><br>");
		out.println("<label for='apellidos'>Apellidos:</label><br>");
		out.println("<input type='text' id='apellidos' name='apellidos' value='Daryanani'><br><br>");
		out.println("<input type='submit' value='Enviar'>");
		out.println("</form> ");
		out.println("<p>Si pulsas 'Enviar' se te dará la bienvenida.</p>");
		out.println("</body>");
		out.println("</html>");
	}

}