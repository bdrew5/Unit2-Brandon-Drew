import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Snowman extends Application {

  public void start(Stage stage){
    Circle bottom = new Circle(150, 120, 40);
    Circle middle = new Circle(150, 80, 30);
    Circle top = new Circle(150, 40, 20);
    Rectangle snow = new Rectangle(0, 120, 300, 120);
    Circle eye1 = new Circle(140, 40, 5);
    Circle eye2 = new Circle(160, 40, 5);
    Rectangle hat1 = new Rectangle(120, 80, 60, 20);
    Rectangle hat2 = new Rectangle(140, 120, 20, 40);
    Line arm1 = new Line(150, 110, 130, 120);
    Line arm2 = new Line(150, 50, 130, 40);

    top.setFill(Color.WHITE);
    middle.setFill(Color.WHITE);
    bottom.setFill(Color.WHITE);
    snow.setFill(Color.WHITE);
    eye1.setFill(Color.BLACK);
    eye2.setFill(Color.BLACK);
    hat1.setFill(Color.BROWN);
    hat2.setFill(Color.BROWN);
    arm1.setFill(Color.BROWN);
    arm2.setFill(Color.BROWN);

    Group root = new Group(middle, bottom, top, snow, eye1, eye2, hat1, hat2, arm1, arm2);
    Scene scene = new Scene(root, 300, 200, Color.BLUE);

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
