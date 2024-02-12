public class Book {
int ID;
String title;
String author;
boolean isCheckedOut=false;

void checkOut(){
    if(isCheckedOut==true){
        System.out.println("Book is checkedout");
    }
    else {
        System.out.println("Book is not checked out ");

    }}
    void returnBook() {
        if (isCheckedOut == false) {
            System.out.println("Book is returned");
        } else {
            System.out.println("Book is not returned");
        }
    }
    public void printDetails(int ID,String title,String author) {
        System.out.println("Book ID: " + ID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Checked Out: " + (isCheckedOut ? "Yes" : "No"));
    }

    public static void main(String[] args) {
    Book book = new Book();
    book.checkOut();
    book.returnBook();
    book.printDetails(1,"Art","Kd");
    }
}
