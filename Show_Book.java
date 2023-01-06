package operation;

import com.library.*;

public class Show_Book implements IBook {
    @Override
    public void work(BookList bookList) {
        Book cur = bookList.headIndex().next;
        while (cur != null) {
            if (cur.getNumber_of_books_in_the_library() > 1) {
                System.out.println("书籍名为:" + cur.getBook_name());
                System.out.println("书籍作者为:" + cur.getBook_actor());
                System.out.println("书籍价格为:" + cur.getBook_price());
                System.out.println("馆藏书籍数量为:" + cur.getNumber_of_book());
                System.out.println("现馆中该书数量:" + cur.getNumber_of_books_in_the_library());
                System.out.println("=============================");

            }
            cur = cur.next;
        }
    }
}
