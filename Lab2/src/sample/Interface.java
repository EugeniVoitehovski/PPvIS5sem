package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Interface {

    Stage stage = new Stage();

    public void handler() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("enter.fxml"));
        stage.close();
        stage.setTitle("");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void ticketsale() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ticketsale.fxml"));
        stage.close();
        stage.setTitle("");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void admin() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("admin.fxml"));
        stage.close();
        stage.setTitle("");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void modifybd() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("BD.fxml"));
        stage.close();
        stage.setTitle("");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void accessrights() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("accessrights.fxml"));
        stage.close();
        stage.setTitle("");
        stage.setScene(new Scene(root));
        stage.show();
    }


}

