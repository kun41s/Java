package LinkedList;

import java.util.*;

public class LinkedListOps2 {
  public static void main(String[] args) {
    LinkedList<StudentInfo> studentList = new LinkedList<StudentInfo>();
    StudentInfo s1 = new StudentInfo("Sujit",1);
    StudentInfo s2 = new StudentInfo("Siddharth",2);
    StudentInfo s3 = new StudentInfo("Karanpreet",3);
    StudentInfo s4 = new StudentInfo("Hari",5);
    StudentInfo s5 = new StudentInfo("Tricha",4);

    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentList.add(s4);

    studentList.remove(3);
    // System.out.println("s1 contained?"+ studentList.contains(s1));
    // System.out.println("s5 contained?"+ studentList.contains(s5));

    StudentInfo s = studentList.get(1);
    System.out.println(s.getDetails());
    // printStudentList(studentList);

  }

  public static void printStudentList(LinkedList<StudentInfo> students) {
    for(StudentInfo s : students) {
      System.out.println(s.getDetails());
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

/*
  SUMMARY
  =======
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
  2. This is a type-safe approach of creating containers. Any attempt to add an element which is
      type-incompatible with the declared contained type will fail at the static type checking stage,
      resulting in a compile error.

*/
