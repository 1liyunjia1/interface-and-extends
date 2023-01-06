package user;

import operation.*;

/**
 * 实现对用户的编写,用户和管理员的权限不同，这里用“对象数组”，实现对不同对象的实现。
 */
public class AdminUser extends User {

    public AdminUser(String name) {
        super(name);
        this.operation = new IBook[]{   // 暂时简单实现两个方法。
                new Add_Book(),
                new Show_Book(),
                new Borrow_Book(),
                new Book_Return()
        };
    }

    @Override
    public void menu() {
        System.out.println("欢迎进入系统");
        System.out.println("1、添加书籍");
        System.out.println("2、查看书籍");
        System.out.println("3、借书");
        System.out.println("4、还书");
        System.out.println("5、删除书籍(勿动，代码暂未写)");
        System.out.println("0、跳出系统");
    }
}
