import java.awt.CardLayout;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import logic.Cart;

public class FirstServlet extends javax.servlet.http.HttpServlet {
  protected void doPost(javax.servlet.http.HttpServletRequest request,
      javax.servlet.http.HttpServletResponse response)
      throws javax.servlet.ServletException, IOException {

  }

  protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    HttpSession session = request.getSession();

    Cart cart = (Cart) session.getAttribute("cart");

    String name = request.getParameter("name");
    int quantity = Integer.parseInt(request.getParameter("quantity"));

    if(cart == null)
    {
      cart = new Cart();
      cart.setName(name);
      cart.setQuantity(quantity);
    }

    session.setAttribute("cart", cart);

    getServletContext().getRequestDispatcher("/showCarts.jsp").forward(request, response);

    String name2 = request.getParameter("name");
    String surname = request.getParameter("quantity");
    PrintWriter printWriter = response.getWriter();
    printWriter.println("<html>");
    printWriter.println("<h1>Hello!!!, " +  name2 + " "+ surname +"</h1>");
    printWriter.println("</html>");


    ///Redirect
    //response.sendRedirect("/first_Jsp.jsp");

    //forward
    //RequestDispatcher requestDispatcher = request.getRequestDispatcher("/first_Jsp.jsp");
    //requestDispatcher.forward(request, response);

  }
}
