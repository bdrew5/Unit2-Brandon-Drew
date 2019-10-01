import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstFX extends Application {

  public void start(Stage stage){
    Rectangle box = new Rectangle(50, 50, 100, 100);
    Circle circle = new Circle(100, 100, 50);
    Polygon polygon = new Polygon(50, 50, 50, 80, 70, 90, 70, 40);
    Text hi = new Text(60, 100, "Hi, I'm Brandon");

    box.setStroke(Color.RED);
    circle.setStroke(Color.WHITE);
    polygon.setStroke(Color.LIGHTGREEN);
    hi.setStroke(Color.BLUE);

    box.setFill(null);
    circle.setFill(null);

    Group root = new Group(box, circle, polygon, hi);
    Scene scene = new Scene(root, 200, 200, Color.BLACK);

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
