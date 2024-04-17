package library;

import java.util.List;


public class Member {
    private String memberId;
    private String name;
    private String email;
    private List<Book> booksBorrowed;

    public Member(String memberId, String name, String email, List<Book> booksBorrowed) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.booksBorrowed = booksBorrowed;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public boolean borrowBook(Book book){
        if (book.checkAvailability()){
            book.available = false;
            booksBorrowed.add(book);
            System.out.println("Muon sach thanh cong");
            return true;
        }
        else {
            System.out.println("Muon sach ko thanh cong");
            return false;
        }

    }
    public void returnBook(Book book){
        book.available = true;
        booksBorrowed.remove(book);
        System.out.println("Tra sach thanh cong");
    }
}