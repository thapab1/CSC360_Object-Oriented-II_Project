import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import java.lang.Math;
import java.util.*;
import javafx.scene.input.MouseEvent;

public class Assignment8 extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {


// Create a HBox pane
        HBox pane = new HBox();


// Create arraylist of image
        ArrayList<Image> cards = new ArrayList<>();
//Add 52 card image using for loop
        for(int k = 0; k< 52; k++) {
            cards.add(getImage(k));
        }

//Generate the random number to generate random cards
        int card1 = (int)(Math.random() * 51 + 1);
        int card2 =  (int)(Math.random() * 51 + 1);
        int card3 = (int)(Math.random() * 51 + 1);


        ImageView imageview1 = new ImageView(cards.get(card1));


        imageview1.setOnMouseClicked((MouseEvent e)->{
            cards.remove(card1);
            int newImage = (int)(Math.random() * ((cards.size()-1) + 1));
            imageview1.setImage(cards.get(newImage));
        });


        imageview1.fitHeightProperty().bind(pane.heightProperty());

        imageview1.fitWidthProperty().bind(pane.widthProperty().divide(3));

        pane.getChildren().add(imageview1);


        ImageView imageview2 = new ImageView(cards.get(card2));

        imageview2.setOnMouseClicked((MouseEvent e)->{

            cards.remove(card1);
            int newImage = (int)(Math.random() * ((cards.size()-1) + 1));
            imageview2.setImage(cards.get(newImage));
        });

//Bind the height and width of imageview with the pane
        imageview2.fitHeightProperty().bind(pane.heightProperty());

        imageview2.fitWidthProperty().bind(pane.widthProperty().divide(3));

        pane.getChildren().add(imageview2);
        ImageView imageview3 = new ImageView(cards.get(card3));

        imageview3.setOnMouseClicked((MouseEvent e)->{
            cards.remove(card1);
            int newImage = (int)(Math.random() * ((cards.size()-1) + 1));
            imageview3.setImage(cards.get(newImage));
        });

//Bind the height and width of imageview with the pane
        imageview3.fitHeightProperty().bind(pane.heightProperty());

        imageview3.fitWidthProperty().bind(pane.widthProperty().divide(3));

        pane.getChildren().add(imageview3);



// Create a scene and place it in the stage
        Scene scene = new Scene(pane);
// Set the stage title
        primaryStage.setTitle("Assignment: 8");
// Place the scene in the stage
        primaryStage.setScene(scene);
//Set Height and Width for pane
        primaryStage.setHeight(300);
        primaryStage.setWidth(600);
// Display the stage
        primaryStage.show();
    }
    //Accessor getter method to get image from the path
    private Image getImage(int number) {
        Image image = new Image("file:C:/Users/babyt/CSC260/ClassActivity/CSC360_Assignment7/Images"+ number + ".png");
        return image;
    }

    public static void main(String[] args) {
        launch(args);

    }

}

