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
@WebServlet("/Forgot")
public class Forgot extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDAO sdao=new StudentDAOImpl();
		PrintWriter out=resp.getWriter();
		Student s=sdao.getStudent(Long.parseLong(req.getParameter("phone")),req.getParameter("mail"));
		if(s!=null) {
			if(req.getParameter("pass").equals(req.getParameter("confirmpass"))) {
				s.setPassword(req.getParameter("pass"));
				boolean res=sdao.updateStudent(s);
				if(res) {
					out.println("Password Updated!");
				}
				else {
					out.println("Password does not Updated!");
				}
				
			}
			else {
				out.println("password mismatch");
			}
		}
		else {
			out.println("password entered wrong");
		}
	}			


}
