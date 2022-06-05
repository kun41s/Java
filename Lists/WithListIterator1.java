package Lists;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Iterator;

public class WithListIterator1 {

  public static void main(String[] args) {

    List<StudentInfo> studentList1 = new ArrayList<StudentInfo>();
    StudentInfo s1 = new StudentInfo("Sujit",1);
    StudentInfo s2 = new StudentInfo("Siddharth",2);
    StudentInfo s3 = new StudentInfo("Karanpreet",3);
    StudentInfo s4 = new StudentInfo("Hari",5);
    StudentInfo s5 = new StudentInfo("Tricha",4);

    studentList1.add(s1);
    studentList1.add(s2);
    studentList1.add(s3);
    studentList1.add(s4);
    studentList1.add(s5);

    iterateFwd(studentList1);
  }

  private static void iterateFwd(List<StudentInfo> students) {
    ListIterator<StudentInfo> it = students.listIterator();
    System.out.println("Printing student list...");
    while(it.hasNext()) {
      System.out.println(it.next().getDetails());
    }
  }
}
class StudentInfo {
  private final String name;
  private final int rollNumber;

  public StudentInfo(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}
