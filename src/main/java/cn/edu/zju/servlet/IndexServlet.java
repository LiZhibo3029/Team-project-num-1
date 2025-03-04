package cn.edu.zju.servlet;;

import cn.edu.zju.filter.AuthenticationFilter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "IndexServlet", urlPatterns = {"/index"})
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> attributeNames = request.getSession().getAttributeNames();
        System.out.println("print session");
        System.out.println(request.getSession().getAttribute(AuthenticationFilter.USERNAME));
        while (attributeNames.hasMoreElements()) {
            System.out.println(attributeNames.nextElement());
        }
        request.getRequestDispatcher("/views/index.jsp").forward(request, response);
    }
}
