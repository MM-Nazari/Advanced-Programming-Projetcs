package sample;

// ketab khane ha
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.scene.media.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

/**
 *
 * @author MMNazari1380
 * @version 1.0
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        try {
            // talashe namoafagh baraye moosighi
           // String path = "C:/Users/MMNazari1380/Downloads/bensound-acousticbreeze.mp3";
          //  File file=new File("bensound-acousticbreeze (1).mp3");
          //  Media media=new Media(file.toURI().toString());
            //Media media = new Media(new File(path).toURI().toString());
          //  Media media = new Media(getClass().getResource("bensound-acousticbreeze.mp3").toString());
          //  Media media = new Media("file:///C:/Users/MMNazari1380/IdeaProjects/PayanTermProject/src/sample/bensound-acousticbreeze (1).mp3");
          //  MediaPlayer mediaPlayer = new MediaPlayer(media);
          //  mediaPlayer.setAutoPlay(true);
            // music();
            //taeene .fxml morede nazar
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
          //  FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("menu.fxml"));
            fxmlLoader.setController(new LoginController());
           // fxmlLoader2.setController(new LoginController());
            Parent root = fxmlLoader.load();
          //  Parent root2 = fxmlLoader2.load();
          //  Parent root2 = FXMLLoader.load(getClass().getResource("menu.fxml"));
           // fxmlLoader.setController(new MenuController());
            stage.setTitle("login");
            //chidane size safhe
            // taeene stage va scene
            stage.setScene(new Scene(root, 600, 400));
           // stage.setScene(new Scene(root2, 600, 400));
           // stage.setScene(new Scene(root2, 600, 400));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //  talashe namoafagh baraye moosighi
  //  public void music () throws Exception {
   //     String m = "C:/Users/MMNazari1380/Downloads/bensound-acousticbreeze.mp3" ;
  //      Media h = new Media(Paths.get(m).toUri().toString());
   //     MediaPlayer mediaPlayer = new MediaPlayer(h);
   //     mediaPlayer.play();

   // }

    public static void main(String[] args) {
        launch(args);

    }
}
