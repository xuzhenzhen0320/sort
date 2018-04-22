package output;

import sort.Student;

import java.io.File;
import java.util.List;

public interface Output {

    void output(File file,List<Student> studentList);
}
