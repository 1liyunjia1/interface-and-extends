import user.*;
import com.library.BookList;

import java.util.Scanner;

public class main_work {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user = identity();
        BookList head = new BookList();
        while (true) {
            user.menu();
            int operation = scanner.nextInt();
            if (operation == 0) {
                System.exit(-1);
            }
            user.doOperation(operation, head);
        }
    }

    public static User identity() {
        System.out.println("输入你的身份:(1是Adminer ,2 是Normal)");

        int sum = scanner.nextInt();

        if (sum == 1) {
            return new AdminUser("小辉");
        } else {
            return new NormalUser("小辉");
        }
    }
}
