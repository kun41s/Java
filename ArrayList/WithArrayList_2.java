package ArrayList;
import java.util.*;

public class WithArrayList_2 {

  public static void main (String[] args) {
    ArrayList studentList = new ArrayList();
    studentList.add(new StudentInfo("Sujit", 1));
    studentList.add(new StudentInfo("Siddharth", 2));
    studentList.add(new StudentInfo("Karanpreet", 3));

    studentList.add(new StudentInfo("Tricha", 4));
    printStudentList(studentList);
  }

  public static void printStudentList(ArrayList students) {
    for(Object o : students) {
      StudentInfo s = (StudentInfo) o;
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
      This is a type-unsafe approach of creating containers. We can add anything into the List which may
      result in a variety of runtime type errors.
  2. When printing, the ArrayList prints the elements in the same sequence as they had been inserted.
      In other words, ArrayList (and any other form of lists, including arrays) remember the sequence
      of insertion. This is an important property which can be safely exploited in the program design.
      There are other containers, e.g. Sets and Maps, where the sequence of insertion is of no 
      consequence. A program using such containers must not depend on them to remember the sequence of
      insertion for its correctness.

  3. Using a non-generic ArrayList is type-unsafe.
*/
