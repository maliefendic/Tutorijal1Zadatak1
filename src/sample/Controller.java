package sample;


import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
public Button btnHello;
public Label labela;
    public void Promjeni(ActionEvent actionEvent) {
    labela.setText("Hello World!");
    }
}
