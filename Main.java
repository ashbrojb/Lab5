// My partner for this lab is Christopher Fenter

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    student1.print();

    Student student2 = new Student();

    student2.setName("Jon Ashbrook");
    student2.setGPA(3.5);
    student2.setMajor("Information Systems & Accounting");

    student2.print();

    ArrayList<Double> gpas = new ArrayList<Double>();
    gpas.add(student1.gpa);
    gpas.add(student2.gpa);

    double sum = 0;

    for(int i = 0; i < 1; i++){
      sum = sum + student1.gpa + student2.gpa;
      System.out.println("The average GPA is " + sum/gpas.size());}

    }


  }



