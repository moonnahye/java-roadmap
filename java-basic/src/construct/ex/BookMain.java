package construct.ex;

public class BookMain {
    public static void main(String[] args) {

        Book boo1 = new Book();
        boo1.displayInfo();

        Book book2 = new Book("Java","Seo");
        book2.displayInfo();

        Book book3 = new Book("Java프로그래밍","kim",700);
        book3.displayInfo();
    }
}
