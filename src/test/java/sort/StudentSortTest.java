package sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class StudentSortTest {
    List<Student> studentList = new ArrayList<Student>();
    List<Student> resultList1 = new ArrayList<Student>();
    List<Student> resultList2 = new ArrayList<Student>();
    List<Student> resultList3 = new ArrayList<Student>();
    List<Student> resultList4 = new ArrayList<Student>();
    List<Student> resultList5 = new ArrayList<Student>();
    List<Student> resultList6 = new ArrayList<Student>();
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

        //测试1,按照学号正向排序
        resultList1.add(s2);
        resultList1.add(s1);
        resultList1.add(s3);
        resultList1.add(s4);
        resultList1.add(s5);

        //测试2，按照学号逆向排序
        resultList2.add(s5);
        resultList2.add(s4);
        resultList2.add(s3);
        resultList2.add(s1);
        resultList2.add(s2);

        //测试3，按照年龄逆向排序
        resultList3.add(s4);
        resultList3.add(s5);
        resultList3.add(s1);
        resultList3.add(s2);
        resultList3.add(s3);

        //测试4，按照年龄逆向排序
        resultList4.add(s3);
        resultList4.add(s2);
        resultList4.add(s1);
        resultList4.add(s5);
        resultList4.add(s4);

        //测试5，按照成绩正向排序
        resultList5.add(s5);
        resultList5.add(s1);
        resultList5.add(s4);
        resultList5.add(s2);
        resultList5.add(s3);

        //测试6，按照成绩逆向排序
        resultList6.add(s3);
        resultList6.add(s2);
        resultList6.add(s4);
        resultList6.add(s1);
        resultList6.add(s5);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sort() throws Exception {
        assertEquals(resultList1,new StudentSort().sort(studentList,1,0));
        assertEquals(resultList2,new StudentSort().sort(studentList,1,1));
        assertEquals(resultList3,new StudentSort().sort(studentList,2,0));
        assertEquals(resultList4,new StudentSort().sort(studentList,2,1));
        assertEquals(resultList5,new StudentSort().sort(studentList,3,0));
        assertEquals(resultList6,new StudentSort().sort(studentList,3,1));
    }


}