import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler; 

public class Main_b extends Application {
@Override public void start(Stage primaryStage) throws Exception {
   Button bt=new Button("Say Hello world");
   bt.setOnAction(new EventHandler<ActionEvent>(){
   public void handle(ActionEvent ev) {
      System.out.println("Hello World");
   }});
   Button bt2=new Button("+");
   bt2.setOnAction(new EventHandler<ActionEvent>(){
   public void handle(ActionEvent ev) {
      System.out.println("it is addition");
   }});
   Button bt3=new Button("-");
   bt3.setOnAction(new EventHandler<ActionEvent>(){
   public void handle(ActionEvent ev) {
      System.out.println("it is subtract");
   }});
   HBox sd=new HBox();
   sd.getChildren().add(bt);
   sd.getChildren().add(bt2);
   VBox sdv=new VBox();
   sdv.getChildren().add(bt3);

   Scene sc=new Scene(sd,500,500);
   sc.addLayout(sdv);
   primaryStage.setTitle("My first prog");
   primaryStage.setScene(sc);
   primaryStage.show();
   }
   public static void main(String[] args){
      launch(args);
   }
}