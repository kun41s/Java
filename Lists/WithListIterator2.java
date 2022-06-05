package Lists;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Iterator;

public class WithListIterator2 {

  public static void main(String[] args) {

    List<StudentDetails> studentList1 = new ArrayList<StudentDetails>();
    StudentDetails s1 = new StudentDetails("Sujit",1);
    StudentDetails s2 = new StudentDetails("Siddharth",2);
    StudentDetails s3 = new StudentDetails("Karanpreet",3);
    StudentDetails s4 = new StudentDetails("Hari",5);
    StudentDetails s5 = new StudentDetails("Tricha",4);

    studentList1.add(s1);
    studentList1.add(s2);
    studentList1.add(s3);
    studentList1.add(s4);
    studentList1.add(s5);

    //iterateFwd(studentList1);
    iterateBkwd(studentList1);
  }

  private static void iterateFwd(List<StudentDetails> students) {
    ListIterator<StudentDetails> it = students.listIterator();
    System.out.println("Printing student list...");
    while(it.hasNext()) {
      System.out.println(it.next().getDetails());
    }
  }
  private static void iterateBkwd(List<StudentDetails> students) {
    ListIterator<StudentDetails> it = students.listIterator(students.size());
    System.out.println("Printing student list...");
    while(it.hasPrevious()) {
      System.out.println(it.previous().getDetails());
    }
  }
}
class StudentDetails {
  private final String name;
  private final int rollNumber;

  public StudentDetails(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}
