import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 23.04.2017.
 */
public class StudentList {
//    получаем ссылку на список
static List<Student> studentList = createStudentList();
// создает список
    private static List<Student> createStudentList() {
        List<Student> list = new ArrayList<>();
        return list;
    }
    public  static List<Student> setStudentList(){
     return studentList    ;
    }

}
