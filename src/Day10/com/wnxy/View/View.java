package Day10.com.wnxy.View;

public abstract class View {
    private String viewName;
    protected View nextView;
    private int choose;

    public int getChoose() {
        return choose;
    }

    public void setChoose(int choose) {
        this.choose = choose;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }



    public View(String viewName){
        this.viewName=viewName;
    }
    private void showViewName(){
        System.out.println("XX客户关系管理系统》》"+viewName);
    }
    private void showSeparatorLine(){
        System.out.println("…………………………………………………………………………");
    }
    protected abstract View showViewContent();
    public final View showView(){
        showViewName();
        showSeparatorLine();
        nextView=showViewContent();
        showSeparatorLine();
        return nextView;
    }
}
