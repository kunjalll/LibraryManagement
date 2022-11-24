package model;

public class borrowing {
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getExtraDays() {
        return extraDays;
    }

    public void setExtraDays(int extraDays) {
        this.extraDays = extraDays;
    }

    public int getFineRate() {
        return fineRate;
    }

    public void setFineRate(int fineRate) {
        this.fineRate = fineRate;
    }

    int bookId;
    int studentId;
    int extraDays;
    int fineRate;

    public borrowing(int bookId, int studentId, int extraDays, int fineRate) {
        this.bookId = bookId;
        this.studentId = studentId;
        this.extraDays = extraDays;
        this.fineRate = fineRate;
    }
    public void fine(){
        double fine = (this.fineRate*this.extraDays);
        System.out.println("the fine is "+fine+ " of studentId "+ this.studentId);
    }
}
