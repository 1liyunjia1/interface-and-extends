package user;

import com.library.BookList;
import operation.IBook;


/**
 * 在这里，我们的用户分为普通用户（NormalUser）以及我们的管理员（AdminUser）,他们都是用户，所以让他们都继承用户的特点
 * 他们都有自己的名字，都有自己的使用权限，这里我们的权限使用的是用一个类的数组
 * 数组对应的”值“为对应的是实现类的对象，大大方便我们的操作。
 *

 */
abstract public class User {
    protected String name;
    protected IBook[] operation;  // 创建多个测试用例。
    public User(String name){
        this.name =name;
    }
    abstract public void menu();
    public void doOperation(int choice , BookList bookList){
        operation[choice-1].work(bookList);// 对对象中再次使用对象,实现一个对象数组，每次通过访问数组下标来实现对象。
    }
}
