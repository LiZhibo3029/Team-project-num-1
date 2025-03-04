package cn.edu.zju.servlet;

import cn.edu.zju.bean.DosingGuideline;
import cn.edu.zju.dao.DosingGuidelineDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DosingGuidelineServlet",  urlPatterns = "/dosingGuideline")
public class DosingGuidelineServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DosingGuidelineDao dosingGuidelineDao = new DosingGuidelineDao();
        List<DosingGuideline> dosingGuidelines = dosingGuidelineDao.findAll();
        request.setAttribute("dosingGuidelines", dosingGuidelines);
        request.getRequestDispatcher("/views/dosing_guideline.jsp").forward(request, response);
    }
}
