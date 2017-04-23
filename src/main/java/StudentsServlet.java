import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 23.04.2017.
 */
@WebServlet(name = "StudentsServlet")
public class StudentsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//       принимает параметр name
        String name = request.getParameter("name");
        //       принимает параметр family
        String family= request.getParameter("family");
//        создали спиок
//        List<Student> list = new ArrayList<Student>();
        List<Student> list = StudentList.setStudentList();
        //        создали студента и передача ссылок из полей формы
        Student student = new Student();
        student.setName("name");
        student.setFamily("family");
        //        добавляем студента в список
        list.add(new Student(request.getParameter("name"), request.getParameter("family")));
        //        задаем атрибут
        request.setAttribute("list", list );


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("StudentExample.jsp");
        requestDispatcher.forward(request, response);

    }
}
