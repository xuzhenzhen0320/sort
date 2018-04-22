package output;

import sort.Student;

import java.io.File;
import java.util.List;

public class PrintOutput implements Output {
    public void output(File file,List<Student> studentList) {
        if(studentList!=null && !studentList.isEmpty()){
            for(Student data : studentList){
                System.out.println(data.getId()+","+data.getName()+","+data.getAge()+","+data.getScore());
            }
        }
    }
}
