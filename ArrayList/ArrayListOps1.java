package ArrayList;

import java.util.*;

public class ArrayListOps1 {
  public static void main(String[] args) {
    ArrayList<StudentDetails> studentList = new ArrayList<StudentDetails>();
    studentList.add(new StudentDetails("Sujit", 1));
    studentList.add(new StudentDetails("Siddharth", 2));
    // studentList.add(10,new Student("Karanpreet", 3));  // this would lead to runtime error
    studentList.add(0,new StudentDetails("Karanpreet", 3));
    studentList.add(new StudentDetails("Hari", 5));
    studentList.add(new StudentDetails("Tricha", 4));

    studentList.remove(3);

    printStudentList(studentList);
  }

  public static void printStudentList(ArrayList<StudentDetails> students) {
    for(StudentDetails s : students) {
      System.out.println(s.getDetails());
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

/*
  SUMMARY
  =======
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
  2. This is a type-safe approach of creating containers. Any attempt to add an element which is
      type-incompatible with the declared contained type will fail at the static type checking stage,
      resulting in a compile error.

*/
