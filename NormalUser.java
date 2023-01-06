package user;

import operation.*;

public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.operation = new IBook[]{
                new Borrow_Book(),
                new Show_Book(),
                new Search_Book(),
                new Book_Return()
        };

    }

    @Override
    public void menu() {
        System.out.println("欢迎进入系统");
        System.out.println("----------");
        System.out.println("1、借书");
        System.out.println("2、查看书籍(全部)");
        System.out.println("3、查看指定书籍");
        System.out.println("4、还书");
        System.out.println("0、跳出系统");

    }
}
