
package studentmanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class StudentManagementSystem extends Application {
    
    private double x = 0 ;
    private double y = 0;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
//        LETS DESIGN IT USING CSS : ) 

        root.setOnMousePressed((MouseEvent event) ->{
            x = event.getSceneX();
            y = event.getSceneY();
        });
        
        root.setOnMouseDragged((MouseEvent event) ->{
            stage.setX(event.getScreenX() - x);
            stage.setY(event.getScreenY() - y);
            
            stage.setOpacity(.8);
        });
        
        root.setOnMouseReleased((MouseEvent event) ->{
            stage.setOpacity(1);
        });
        
        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }
//WE FORGOT TO IMPORT FONT AWESOME JAR FILE TO LIBRARIES : ) 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
