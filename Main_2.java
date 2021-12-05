import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;  
import javafx.scene.layout.StackPane;
import javafx.scene.shape.*;
import javafx.scene.Group;

public class Main_2 extends Application {
   @Override public void start(Stage primarystage) throws Exception {
      Rectangle rect=new Rectangle();
      rect.setX(10);
      rect.setY(20);
      rect.setWidth(40);
      rect.setHeight(50);
rect.strokeWidth(3);
rect.setFill(paint);
Circle cir=new Circle();
      Group root=new Group();
      root.getChildren().add(rect);
root.getChildren().add(cir);
      Scene ssc=new Scene(root,300,500);
      primarystage.setScene(ssc);
      primarystage.setTitle("rectangle shape");
      primarystage.show();
      
   }
   public static void main(String[] args) {
      launch(args);
   }
}