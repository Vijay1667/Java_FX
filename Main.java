import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

@Override public void start(Stage primarystage) throws Exception {
primarystage.setTitle("Title of the Window");

Button b1=new Button();
b1.setText("Click me");
// or new Button("Click me");

StackPane layout=new StackPane();
layout.getChildren().add(b1);

Scene scene=new Scene(layout, 200,200);

primarystage.setScene(scene);
primarystage.show();

}
public static void main(String[] args) {
launch(args);
}
}
