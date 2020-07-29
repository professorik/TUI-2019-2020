package Problem_4;

import com.drew.imaging.ImageProcessingException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/Problem_4/sortImages.fxml"));
        primaryStage.setTitle("Upload Files");
        primaryStage.getIcons().add(new Image("/resources/cloud-storage-uploading-option.png"));
        primaryStage.setScene(new Scene(root, 1900, 960));
        primaryStage.show();
    }


    public static void main(String[] args) throws ImageProcessingException, IOException {
        launch(args);
    }
}
