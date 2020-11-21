package Day9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void init() throws Exception {
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button=new Button("点我");
        button.setOnAction(e->{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("警告框");
            alert.setContentText("这是点击事件的响应");
            alert.setHeaderText("确认信息");
            alert.showAndWait();
        });
        Scene scene=new Scene(button,900,900);
        primaryStage.setScene(scene);
        primaryStage.setTitle("六子棋");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.show();
    }


    @Override
    public void stop() throws Exception {
    }
}
