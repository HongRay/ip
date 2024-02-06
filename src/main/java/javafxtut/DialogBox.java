package javafxtut;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.shape.Circle;
import javafx.scene.layout.HBox;
import java.io.IOException;
import java.util.Collections;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;




public class DialogBox extends HBox {

    private Label text;
    //private ImageView displayPicture;

    @FXML
    private Label dialog;
    @FXML
    private ImageView displayPicture;

//    public DialogBox(Label l, ImageView iv) {
//        text = l;
//        displayPicture = iv;
//
//        text.setWrapText(true);
//        displayPicture.setFitWidth(100.0);
//        displayPicture.setFitHeight(100.0);
//
//        Circle clip = new Circle(displayPicture.getFitWidth() / 2, displayPicture.getFitHeight() / 2, displayPicture.getFitWidth() / 2);
//        displayPicture.setClip(clip);
//
//        // Add padding between the image and label
//        this.setSpacing(10); // This sets 10 pixels of space between the ImageView and Label in the HBox
//
//        this.setAlignment(Pos.TOP_RIGHT);
//        this.getChildren().addAll(displayPicture, text); // Assuming you want the image on the left and text on the right
//
//
//        // Set padding and background color
//        this.setPadding(new Insets(10)); // adds padding inside the HBox
//        this.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, new CornerRadii(5.0), Insets.EMPTY))); // sets background color to light gray and gives rounded corners
//    }
//
//    private void flip() {
//        this.setAlignment(Pos.TOP_LEFT);
//        ObservableList<Node> tmp = FXCollections.observableArrayList(this.getChildren());
//        FXCollections.reverse(tmp);
//        this.getChildren().setAll(tmp);
//        // Set padding and background color for flipped dialog box
//        this.setBackground(new Background(new BackgroundFill(Color.BEIGE, new CornerRadii(5.0), Insets.EMPTY))); // changes background color for the "flipped" dialog box
//    }
//
//    public static DialogBox getUserDialog(Label l, ImageView iv) {
//        return new DialogBox(l, iv);
//    }
//
//    public static DialogBox getDukeDialog(Label l, ImageView iv) {
//        var db = new DialogBox(l, iv);
//        db.flip();
//        return db;
//    }

private DialogBox(String text, Image img) {
    try {
        FXMLLoader fxmlLoader = new FXMLLoader(MainWindow.class.getResource("/view/DialogBox.fxml"));
        fxmlLoader.setController(this);
        fxmlLoader.setRoot(this);
        fxmlLoader.load();
    } catch (IOException e) {
        e.printStackTrace();
    }

    dialog.setText(text);
    displayPicture.setImage(img);
}

    /**
     * Flips the dialog box such that the ImageView is on the left and text on the right.
     */
    @FXML
    private void flip() {
        ObservableList<Node> tmp = FXCollections.observableArrayList(this.getChildren());
        Collections.reverse(tmp);
        getChildren().setAll(tmp);
        setAlignment(Pos.TOP_LEFT);
    }

    public static DialogBox getUserDialog(String text, Image img) {
        return new DialogBox(text, img);
    }

    public static DialogBox getDukeDialog(String text, Image img) {
        var db = new DialogBox(text, img);
        db.flip();
        return db;
    }
}

