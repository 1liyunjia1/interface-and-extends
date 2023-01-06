package com.library;

/**
 * 这里我使用链表的方式用来存储数据，而不是使用顺序表。
 * 使用虚拟同节点用于方便我们的算法。
 */
public class BookList {
    Book book_head = new Book("运佳系统的头节点",
            "李运佳",100,1,1);
    public BookList(){
    }
    public Book headIndex(){
        return book_head;
    }
}
