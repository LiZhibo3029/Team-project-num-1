package cn.edu.zju.servlet;

import cn.edu.zju.bean.Drug;
import cn.edu.zju.dao.DrugDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DrugServlet",  urlPatterns = "/drugs")
public class DrugServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DrugDao drugDao = new DrugDao();
        List<Drug> all = drugDao.findAll();

        request.setAttribute("drugs", all);
        request.getRequestDispatcher("/views/drugs.jsp").forward(request, response);
    }
}
