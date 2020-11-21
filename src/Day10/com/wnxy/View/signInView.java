package Day10.com.wnxy.View;

public class signInView extends View {

    public signInView() {
        super("登录界面");
    }

    @Override
    protected View showViewContent() {
        System.out.println("正在登录");
        System.out.println("登录成功！");
        return nextView;
    }
}
