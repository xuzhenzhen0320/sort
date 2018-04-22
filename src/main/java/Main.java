import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //排序的类型
        System.out.println("请输入排序类型：1-按学号排序；2-按年龄排序；3-按成绩排序");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();

        //是否降序
        System.out.println("排序是否降序：0-正序；1-降序");
        int descend = sc.nextInt();

        //排序
        List<Student> studentList = CSVUtils.importCsv(new File("F:/IDEAWorkSpace/quizsort/student.csv"));
        studentList = Sort.sort(studentList,type,descend);

        //输出到控制台
        if(studentList!=null && !studentList.isEmpty()){
            for(Student data : studentList){
                System.out.println(data.getId()+","+data.getName()+","+data.getAge()+","+data.getScore());
            }
        }

        //输出到文件
        CSVUtils.exportCsv(new File("F:/IDEAWorkSpace/quizsort/sort.csv"),studentList);
    }

}

