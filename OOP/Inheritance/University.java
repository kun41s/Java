package OOP.Inheritance;

public class University {
    public static void main(String[] args) {
        Student s1 = new Student("Kunal", 4);
        System.out.println(s1.getDetails());

        ResearchStudent s2 = new ResearchStudent("Nikita", 2, "Software Engineering");
        System.out.println(s2.getDetails());

        PhDStudent s3 = new PhDStudent("Rohit", 1, "Software Engineering", "Automated Evaluation");
        System.out.println(s3.getDetails());
    }
}

class Student {
    private final String name;
    private int year;
    private static final int annualFees = 10000;

    public Student (String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getDetails() {
        return "Name: " + name + "\n" + "Fees: "+ this.computeFees();
    }

    public float computeFees() {
        return Student.annualFees * this.year;
    }
}


class ResearchStudent extends Student {
    private String reaserchArea;
    public ResearchStudent (String name, int year, String reaserchArea) {
        super(name, year);
        this.reaserchArea = reaserchArea;
    }
}

class PhDStudent extends ResearchStudent {
    private String thesisTitle;

    public PhDStudent(String name, int year, String researchArea, String thesisTitle) {
        super(name, year, researchArea);
        this.thesisTitle = thesisTitle;

    }
}
