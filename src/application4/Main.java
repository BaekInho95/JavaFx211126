package application4;
	

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		try {
			//패딩 설정
			HBox hbox = new HBox(); 
			hbox.setPadding(new Insets(50, 10, 10 , 50)); 

			Button button = new Button(); 
			button.setPrefSize(100, 100);
			//마진 설정
			/*
			HBox hbox = new HBox(); 
			Button button = new Button(); 
			button.setPrefSize(100, 100);
			hbox.setMargin(button, new Insets(10,10,50,50));
			*/
			hbox.getChildren().add(button);
			Scene scene = new Scene(hbox);
			
			primaryStage.setTitle("AppMain"); 
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
