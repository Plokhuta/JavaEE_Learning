import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServlet;

public class LibraryServlet extends HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request,
        javax.servlet.http.HttpServletResponse response)
        throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
      PrintWriter printWriter = response.getWriter();

      try {
        Class.forName("org.postgresql.Driver");
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }

      try {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "962810");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT title FROM books");

        while (resultSet.next()){
          printWriter.println(resultSet.getString("title"));
        }


        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }


}
