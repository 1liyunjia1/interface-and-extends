package operation;

import com.library.Book;
import com.library.BookList;

import java.util.Scanner;

/**
 * 查书我这里用最直接的遍历搜索，当有SQL时可以方便用其他的方式搜索。
 */

public class Borrow_Book implements IBook{
    @Override
    public void work(BookList bookList) {
        Book book = bookList.headIndex().next;
        System.out.print("请输入书名:");
        Scanner scanner = new Scanner(System.in);
        String book_name = scanner.next();
        while (book != null) {
            if (book.getBook_name().equals(book_name)) {
                if(book.getNumber_of_books_in_the_library()>0){
                    book.setNumber_of_books_in_the_library(book.getNumber_of_books_in_the_library()-1);//运用get与set方法修改数据。
                    System.out.println("借书成功\n");
                }else{
                    System.out.println("书都被借跑了");
                }
                break;
            }
            book = book.next;
        }
        if(book==null){
            System.out.println("馆中未有此书");
        }
    }
}
