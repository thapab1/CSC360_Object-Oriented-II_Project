

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;

import java.awt.*;
import java.lang.Math;

public class Assignment7 extends Application {
    // Overrides the start method in the application class
    @Override
    public void start(Stage primaryStage){
        // create HBox object
        HBox pane = new HBox(5);
        pane.setPadding(new Insets(10,10,10,10));
        // add notes to the pane
        for (int k=0; k<3; k++){
            int randomCard = (int)(1 + Math.random() * 52);
            Image image = new Image(new Image("file:C:/Users/babyt/CSC260/ClassActivity/CSC360_Assignment7/Images" + randomCard + ".png" ));
            pane.getChildren().add(new ImageView(image));
        }
        // create scene
        Scene scene = new Scene(pane);
        // Set the title of the stage
        primaryStage.setTitle("CSC360: Assignment7");
        // Place the scene in the stage
        primaryStage.setScene(scene);
        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
  }

}
