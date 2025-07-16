package in.pentagon.studentapp.DAO;

import java.util.ArrayList;
import in.pentagon.studentapp.dto.Student;
public interface StudentDAO {
public boolean insertStudent(Student s);
public boolean updateStudent(Student s);
public boolean deleteStudent(int id);
public Student getStudent(String mail,String password);
public Student getStudent(long phone,String mail);
public ArrayList<Student> getStudent();
public ArrayList<Student> getStudent(String name);
}
