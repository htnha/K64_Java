package library;

public class Main {
    public static void main(String[]args){
        Book book1 = new Book("12","Sach Van Hoc", "Nguyen Van A", true);
        Member member1 = new Member("2323","Hoang Tuan A", "abc@gmail.com");
        member1.borrowBook(book1);
        member1.returnBook(book1);
    }
}
