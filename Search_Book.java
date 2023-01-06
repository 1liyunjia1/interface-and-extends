package operation;

import com.library.Book;
import com.library.BookList;

import java.util.Scanner;

public class Search_Book implements IBook {


    @Override
    public void work(BookList bookList) {
        Book book = bookList.headIndex().next;
        System.out.print("请输入书名");
        Scanner scanner = new Scanner(System.in);
        String book_name = scanner.next();
        while (book != null) {
            if (book.getBook_name().equals(book_name) && book.getNumber_of_books_in_the_library() > 1) {
                new Show_Cur_Book(book);
                break;
            }
            book = book.next;
        }
        if (book == null) {
            System.out.println("图书馆中未有该书");

        }

    }
}
