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
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.canvas.*;

public class Main_4 extends Application {
   public void start(Stage s) throws Exception {
      s.setTitle("Tree Demo");
      //TO create a tree create a treeitem root
      TreeItem root1=new TreeItem("Programming Classes");
      TreeItem obj1=new TreeItem("Java");
      TreeItem obj2=new TreeItem("Python");
      TreeItem obj3=new TreeItem("C++");
      root1.getChildren().addAll(obj1,obj2,obj3);
      
      TreeItem root2=new TreeItem("Database Classes");
      TreeItem obj4=new TreeItem("Oracle");
      TreeItem obj5=new TreeItem("PL/SQL");
      TreeItem obj6=new TreeItem("Neo4J");
      root1.getChildren().addAll(obj4,obj5,obj6);

      TreeItem root3=new TreeItem("Data Analytics");
      TreeItem obj7=new TreeItem("Hadoop");
      TreeItem obj8=new TreeItem("Mahout");
      TreeItem obj9=new TreeItem("Hive");
      root1.getChildren().addAll(obj7,obj8,obj9);

      TreeItem<String> obj10=new TreeItem<String>("Recent Technologies");
      // to restrict
      obj10.setExpanded(true);
      obj10.getChildren().addAll(root1,root2,root3);

      //to view the tree
      TreeView vv=new TreeView(obj10);
      vv.setPrefHeight(500);
    
      VBox v3=new VBox(20); 
      v3.setPadding(new Insets(5,5,5,20));
      v3.getChildren().addAll(vv);

      Group g1=new Group(v3);

      Scene s1=new Scene(g1,1000,1000);
      s.setScene(s1);
      s.show();
   }   
   public static void main(String[] args) {
      launch(args);


   }
}