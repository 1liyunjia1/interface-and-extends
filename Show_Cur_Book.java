package operation;

import com.library.Book;

/**
 * 由于我们显示的书籍数据可能变化，所以这里我单独把数据拿出来显示，方便下次修改。
 */
public class Show_Cur_Book {
    Show_Cur_Book(Book book){
        System.out.println("书籍名字为:"+book.getBook_name());
        System.out.println("书籍作者为:"+book.getBook_actor());
        System.out.println("书籍价格为:"+book.getBook_price());
        System.out.println("在馆书籍为:"+book.getNumber_of_books_in_the_library());
    }
}
