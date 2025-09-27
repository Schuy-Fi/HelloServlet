import java.io.IOException;
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();   
        out.println("<html>");
        out.println("<head><title>Hello servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Hello from HelloServlet</h1>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }
}
