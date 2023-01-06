package operation;

import com.library.Book;
import com.library.BookList;

import java.util.Scanner;

public class Book_Return implements IBook{

    @Override
    public void work(BookList bookList) {
        Book book = bookList.headIndex().next;
        System.out.print("请输入你要归还的书名:");
        Scanner scanner = new Scanner(System.in);
        String book_name = scanner.next();
        while (book != null) {
            if (book.getBook_name().equals(book_name)) {
                if(book.getNumber_of_books_in_the_library()<book.getNumber_of_book()){
                    book.setNumber_of_books_in_the_library(book.getNumber_of_books_in_the_library()+1);
                    System.out.println("还书成功\n");
                }else{
                    System.out.println("不是本馆的书");
                }
                break;
            }
            book = book.next;
        }
        if(book==null){
            System.out.println("本馆中无此书");
        }
    }
}
