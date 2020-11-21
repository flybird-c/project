package Day10.com.wnxy.View;

public class registerView extends View {

    public registerView( ) {
        super("注册界面");
    }

    @Override
    protected View showViewContent() {
        System.out.println("正在注册");
        System.out.println("注册成功，即将跳转到登录页面");
        nextView=new signInView();
        return nextView;
    }
}
