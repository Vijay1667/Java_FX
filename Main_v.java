import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main_v extends Application {
@Override public void start(Stage primarystage) throws Exception{
Button b1=new Button("Unleash Power");

HBox root=new HBox();
root.getChildren().add(b1);

Scene sc=new Scene(root,300,300);

primarystage.setScene(sc);
primarystage.show();



}
public static void main(String[] args) {
launch(args);
}
}