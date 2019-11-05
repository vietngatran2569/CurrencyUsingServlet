import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "CurrencyServlet",urlPatterns = "/change")
public class CurrencyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
      float rate=Float.parseFloat(request.getParameter("rate"));
      float usd=Float.parseFloat(request.getParameter("usd"));

      float vnd=rate*usd;

        PrintWriter write=response.getWriter();
        write.println("<html>");
        write.println(vnd);
        write.println("</html>");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
