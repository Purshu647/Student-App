package in.pentagon.studentapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import in.pentagon.studentapp.DAO.StudentDAO;
import in.pentagon.studentapp.DAO.StudentDAOImpl;
import in.pentagon.studentapp.dto.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Login")
public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentDAO sdao=new StudentDAOImpl();
		PrintWriter out=resp.getWriter();
		Student s=sdao.getStudent(req.getParameter("mail"), req.getParameter("pass"));
		if(s!=null) {
			out.println("Logged in successfully!"+s.getName());
		}
		else {
			out.println("failed to login");
		}
	}
}
