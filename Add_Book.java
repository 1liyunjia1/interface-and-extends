package operation;

import com.library.Book;
import com.library.BookList;

import java.util.Scanner;

/**
 * 由于吗，每次我们都会用到这里的虚拟头节点，并且为了对每一个方法进行分工,让类接口IBook,使代码具有可读性。
 * 下面的方法同上。
 */

public class Add_Book implements IBook {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void work(BookList bookList) {
        System.out.println("输入添加的书籍:");
        String name = scanner.next();
        System.out.println("输入书籍的作者:");
        String actor = scanner.next();
        System.out.println("输入书籍的价格:");
        int price = scanner.nextInt();
        System.out.println("输入添加的书籍数量:");
        int number = scanner.nextInt();
        Book book = new Book(name, actor, price, number, number);

        Book cur = bookList.headIndex();
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = book;
    }
}
