package output;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sort.Student;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FileOutputTest {
    List<Student> studentList = new ArrayList<Student>();
    @Before
    public void setUp() throws Exception {
        Student s1 = new Student(1501,"张三",20,69);
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
    public void output() throws Exception {
        FileOutput fileOutput = new FileOutput();
        fileOutput.output(new File("test.csv"),studentList);
    }

}