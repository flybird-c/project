package Day10.com.wnxy.View;

import java.util.Scanner;

public class mainView extends View {

    public mainView(String viewName) {
        super("主页面");
    }

    @Override
    protected View showViewContent() {
        System.out.println("1.登录");
        System.out.println("2.注册");
        System.out.println("3.退出");
        Scanner scanner=new Scanner(System.in);
        switch (scanner.nextInt()){
            case 1:
                nextView=new signInView();
                break;
            case 2:
                nextView=new registerView();
                break;
            case 3:
                break;
        }
        return nextView;
    }
}
