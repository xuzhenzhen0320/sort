import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CSVUtils {

    /**
     * ??CSV???????
     * @param file
     * @return
     */
    public static List<Student> importCsv(File file) {
        List<Student> studentList = new ArrayList<Student>();
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                int id = Integer.parseInt(line.split(",")[0]);
                String name = line.split(",")[1];
                int age = Integer.parseInt(line.split(",")[2]);
                int score = Integer.parseInt(line.split(",")[3]);
                Student student = new Student(id,name,age,score);
                studentList.add(student);
            }
        }catch (Exception e) {
        }finally{
            if(br!=null){
                try {
                    br.close();
                    br = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return studentList;
    }

    /**
     *??????CSV??
     * @param file
     * @return
     */
    public static boolean exportCsv(File file,List<Student> studentList){
        boolean success = false;

        return success;

    }
}
