package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller_ChMnd {
	@FXML
	public Button press;
	public TextField input;
	public Label view;
	
	public String text;
	
	@FXML
	public void PressButton(ActionEvent e){
		text = input.getText();
		view.setText(text);
	}

}
