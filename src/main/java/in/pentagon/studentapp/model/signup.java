package in.pentagon.studentapp.model;

import java.util.Scanner;
import in.pentagon.studentapp.DAO.StudentDAO;
import in.pentagon.studentapp.DAO.StudentDAOImpl;
import in.pentagon.studentapp.dto.Student;
public class signup {
public static void signup() {
Scanner sc=new Scanner(System.in);
Student s=new Student();//creation of POJO class object
StudentDAO sdao=new StudentDAOImpl();
//collecting the data from the user
System.out.println("<--Welcome to Signup Page-->");
System.out.println("Enter the name:");
//String name=sc.next();
//s.setName(name);
s.setName(sc.next());
System.out.println("Enter the Phone number");
s.setPhone(sc.nextLong());
System.out.println("Enter the Mail ID");
s.setMail(sc.next());
System.out.println("Enter the Branch");
s.setBranch(sc.next());
System.out.println("Enter the Location");
s.setLoc(sc.next());
System.out.println("Set a new Password");
String password=sc.next();
System.out.println("Confirm the password");
String confirmPassword=sc.next();
if(password.equals(confirmPassword)) {
s.setPassword(confirmPassword);
boolean res=sdao.insertStudent(s);
if(res) {
System.out.println("Data added successfully");
}
else {
System.out.println("Failed to add the data");
}
}
else {
System.out.println("Password mismatch!");
}
}
}
