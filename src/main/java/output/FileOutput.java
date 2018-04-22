package output;

import sort.Student;

import java.io.*;
import java.util.List;

public class FileOutput implements Output {
    public void output(File file,List<Student> studentList) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

            bw.write("学号" + "," + "姓名" + "," + "年龄" + "," + "成绩");
            bw.newLine();
            for(Student data : studentList){
                bw.write(data.getId()+","+data.getName()+","+data.getAge()+","+data.getScore());
                bw.newLine();
            }
            bw.close();
        }catch(FileNotFoundException e) {
            // File对象的创建过程中的异常捕获
            e.printStackTrace();
        } catch (IOException e) {
            // BufferedWriter在关闭对象捕捉异常
            e.printStackTrace();
        }
    }
}
