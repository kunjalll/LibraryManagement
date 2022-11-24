import model.borrowing;
import model.books;
import model.students;

public class Main {
    public static void main(String[] args) {
       borrowing zoe= new borrowing(321, 56, 3, 100) ;
       books book1= new books("dfghj", "dfg", 456, 2011);
       students moon = new students("moon", 12, 8);
    moon.students_format();
    book1.books_format();
    zoe.fine();

    }
}
