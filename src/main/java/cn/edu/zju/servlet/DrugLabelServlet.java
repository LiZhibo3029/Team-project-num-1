package cn.edu.zju.servlet;

import cn.edu.zju.bean.DrugLabel;
import cn.edu.zju.dao.DrugLabelDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DrugLabelServlet",  urlPatterns = "/drugLabels")
public class DrugLabelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DrugLabelDao drugLabelDao = new DrugLabelDao();
        List<DrugLabel> all = drugLabelDao.findAll();

        request.setAttribute("drugLabels", all);
        request.getRequestDispatcher("/views/drug_labels.jsp").forward(request, response);
    }
}
