package sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSort {
    //1为按学号排序，2为按照年龄排序，3为按照成绩排序
    public  List<Student> sort(List<Student> studentList,int type,int descend){

        if(type == 1){
            Collections.sort(studentList, new Comparator<Student>() {
                public int compare(Student o1, Student o2) {
                    int i = o1.getId() - o2.getId();
                    return i;
                }
            });
            if(descend == 1)
                Collections.reverse(studentList);
        }
        else if(type == 2){
            Collections.sort(studentList, new Comparator<Student>() {
                public int compare(Student o1, Student o2) {
                    int i = o1.getAge() - o2.getAge();
                    if(i == 0){
                        return o1.getId() - o2.getId();
                    }
                    return i;
                }
            });
            if(descend == 1)
                Collections.reverse(studentList);
        }
        else if(type == 3){
            Collections.sort(studentList, new Comparator<Student>() {
                public int compare(Student o1, Student o2) {
                    int i = o1.getScore() - o2.getScore();
                    if(i == 0){
                        return o1.getId() - o2.getId();
                    }
                    return i;
                }
            });
            if(descend == 1)
                Collections.reverse(studentList);
        }
        return studentList;
    }

}
