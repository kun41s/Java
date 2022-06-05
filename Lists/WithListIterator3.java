package Lists;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class WithListIterator3 {

  public static void main(String[] args) {

    List<StudentInformation> studentList1 = new ArrayList<StudentInformation>();
    StudentInformation s1 = new StudentInformation("Sujit",1);
    StudentInformation s2 = new StudentInformation("Siddharth",2);
    StudentInformation s3 = new StudentInformation("Karanpreet",3);
    StudentInformation s4 = new StudentInformation("Hari",5);
    StudentInformation s5 = new StudentInformation("Tricha",4);

    studentList1.add(s1);
    studentList1.add(s2);
    studentList1.add(s3);
    studentList1.add(s4);
    studentList1.add(s5);

    //iterateFwd(studentList1);
    //iterateBkwd(studentList1);
    iterateFwdBkwd(studentList1);
  }

  private static void iterateFwd(List<StudentInformation> students) {
    ListIterator<StudentInformation> it = students.listIterator();
    System.out.println("Printing student list...");
    while(it.hasNext()) {
      System.out.println(it.next().getDetails());
    }
  }
  private static void iterateBkwd(List<StudentInformation> students) {
    ListIterator<StudentInformation> it = students.listIterator(students.size());
    System.out.println("Printing student list...");
    while(it.hasPrevious()) {
      System.out.println(it.previous().getDetails());
    }
  }
  private static void iterateFwdBkwd(List<StudentInformation> students) {
    ListIterator<StudentInformation> it = students.listIterator();
    System.out.println("Printing student list...");
    while(it.hasNext()) {
      System.out.println(it.next().getDetails());
    }
    System.out.println("Printing student list...");
    while(it.hasPrevious()) {
      System.out.println(it.previous().getDetails());
    }
  }
}
class StudentInformation {
  private final String name;
  private final int rollNumber;

  public StudentInformation(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}
