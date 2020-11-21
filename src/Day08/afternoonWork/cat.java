package Day08.afternoonWork;

public class cat {
    cat(){

    }
    String catName;
    int catAge;
    String catColor;
    cat(String catName,int catAge,String catColor){
        this.catName=catName;
        this.catAge=catAge;
        this.catColor=catColor;
    }
    void showCat(){
        System.out.println("name:"+catName+"\tage:"+catAge+"\tcolor:"+catColor);
    }
}
