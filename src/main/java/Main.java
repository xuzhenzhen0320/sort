import output.FileOutput;
import output.PrintOutput;
import sort.CSVInput;
import sort.StudentSort;
import sort.Student;

import java.io.File;
import java.io.IOException;
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

        //输入的文件
        System.out.println("请输入需要排序的文件名(需要加入.csv)");
        String inputName = sc.next();

        //输出文件名
        System.out.println("请输入排序后文件的名字(需要加入.csv)");
        String outputName = sc.next();

        //获得当前工程的目录
        String projectFile = "";
        File directory = new File("");//参数为空
        try {
            projectFile = directory.getCanonicalPath();//获取当前工程地址
            //System.out.println(projectFile);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        //排序
        List<Student> studentList = CSVInput.importCsv(new File(projectFile+"\\"+ inputName));
        if(type !=1 && type != 2 && type != 3){
            System.out.println("您输入的排序类型不正确");
        }
        else if(descend != 0 && descend != 1){
            System.out.println("您输入的是否降序不正确");
        }

        else {

            studentList = new StudentSort().sort(studentList, type, descend);
        }

        //输出到控制台
        PrintOutput printOutput = new PrintOutput();
        printOutput.output(new File(projectFile+"\\"+ outputName),studentList);

        //输出到文件
        FileOutput fileOutput = new FileOutput();
        fileOutput.output(new File(projectFile+"\\"+ outputName),studentList);

    }

}

