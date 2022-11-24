package model;

public class students {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    String name;
  int grade;
  int noOfBooks;

    public students(String name, int grade, int noOfBooks) {
        this.name = name;
        this.grade = grade;
        this.noOfBooks = noOfBooks;
    }
    public void students_format() {
        System.out.println("the student is "+" "+ this.name+" of class "+ this.grade+ " and has "+ this.noOfBooks + " books borrowed");
    }
}
