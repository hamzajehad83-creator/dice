package application;
	
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	private int numberofrolls=0;
	@Override
	public void start(Stage primaryStage) {
		Button checker=new Button("Check");
		Label lbl=new Label();
		Label nom=new Label();
		
		checker.setOnAction(e->{
			
			Random random=new Random();
			lbl.setText("You rolled a "+(String.valueOf((random.nextInt(0,6))+1)));
			numberofrolls++;
			if(numberofrolls>1) {
			nom.setText("you rolled the dice "+numberofrolls+" times");
			}else {
				nom.setText("you rolled the dice "+numberofrolls+" time");
			}
		});
		VBox root = new VBox(checker,lbl,nom); 
		Scene scene=new Scene(root);
		root.setAlignment(Pos.CENTER);
		root.setMinSize(200, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
