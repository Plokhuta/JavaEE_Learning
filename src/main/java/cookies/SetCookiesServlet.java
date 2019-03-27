package cookies;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetCookiesServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {


  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    Cookie cookie = new Cookie("id" , "123");
    Cookie cookie1 = new Cookie("name", "Tom");

    cookie.setMaxAge(24 * 60 * 60);
    cookie1.setMaxAge(24 * 60 * 60);

    response.addCookie(cookie);
    response.addCookie(cookie1);

    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/get_cookies_servlet");
    requestDispatcher.forward(request, response);
  }
}
