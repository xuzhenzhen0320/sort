package sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CSVInputTest {
    List<Student> studentList = new ArrayList<Student>();
    @Before
    public void setUp() throws Exception {

        Student s1 = new Student(1501,"张三",26,69);
        studentList.add(s1);
        Student s2 = new Student(1500,"周白诗",22,93);
        studentList.add(s2);
        Student s3 = new Student(1502,"秦婷婷",23,100);
        studentList.add(s3);
        Student s4 = new Student(1503,"肖舒",16,87);
        studentList.add(s4);
        Student s5 = new Student(1504,"何圆",18,65);
        studentList.add(s5);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void importCsv() throws Exception {
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
        assertEquals(studentList,new CSVInput().importCsv(new File(projectFile+"\\"+"test.csv")));
    }

}