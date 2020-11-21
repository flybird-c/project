package Day10.com.wnxy.View;

public class Main {
    public static void main(String[] args) {
        View view =new mainView("mainView");
        while (view!=null){
            view=view.showView();
        }
        System.out.println("欢迎下次使用");
    }
}
