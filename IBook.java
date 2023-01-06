package operation;

import com.library.BookList;

/**
 * 由于在这里所有的类都会用到链表的虚拟头节点，所以就发现他们都有一个特点，即”像什么“，他们都有方法，方法都用到这个东西，
 * 蓑衣我这里用到的是一个借口，让每一个类都用到这个东西。
 */
public interface IBook {
    void work(BookList bookList);
}
