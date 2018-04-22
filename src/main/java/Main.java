import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Student> studentList = CSVUtils.importCsv(new File("F:/IDEAWorkSpace/quizsort/student.csv"));
        if(studentList!=null && !studentList.isEmpty()){
            for(Student data : studentList){
                System.out.println(data.getId()+','+data.getName()+','+data.getAge()+','+data.getScore());
            }
        }
    }

}

