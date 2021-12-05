import javafx.scene.Scene;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.Group;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
//import javafx.text.Text;
import javafx.stage.Stage;
import javafx.scene.canvas.*;

public class Main_3 extends Application {
   public void start(Stage s) throws Exception {
      ToggleGroup obj =new ToggleGroup();
      RadioButton obj1=new RadioButton("Choice-1");
      RadioButton obj2=new RadioButton("Choice-2");
      RadioButton obj3=new RadioButton("Choice-3");
      RadioButton obj4=new RadioButton("Choice-4");
      
      obj1.setToggleGroup(obj);
      obj2.setToggleGroup(obj);
      obj3.setToggleGroup(obj);
      obj4.setToggleGroup(obj);

      VBox v1=new VBox();
      v1.setSpacing(10);
      v1.getChildren().add(obj1);
      v1.getChildren().add(obj2);
      v1.getChildren().add(obj3);
      v1.getChildren().add(obj4);
      //v1.getChildren.addAll(obj1,obj2,obj3,obj4);

      Scene s1=new Scene(v1,400,500);
      s.setScene(s1);
      s.show();

}   
public static void main(String[] args) {
      launch(args);


}
}