import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CSVUtils {

    /**
     *读入CSV文件并存在List中
     * @param file
     * @return
     */
    public static List<Student> importCsv(File file) {
        List<Student> studentList = new ArrayList<Student>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            String line = "";
            br.readLine();//读标题行
            while ((line = br.readLine()) != null) {
                int id = Integer.parseInt(line.split(",")[0]);
                String name = line.split(",")[1];
                int age = Integer.parseInt(line.split(",")[2]);
                int score = Integer.parseInt(line.split(",")[3]);
                Student student = new Student(id,name,age,score);
                studentList.add(student);

            }
        }catch (Exception e) {
        }

        return studentList;
    }

    /**
     *
     * @param file
     * @param studentList
     * @return
     */
    public static void exportCsv(File file,List<Student> studentList){
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
