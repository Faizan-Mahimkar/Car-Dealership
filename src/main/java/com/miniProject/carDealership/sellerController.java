package com.miniProject.carDealership;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class sellerController {
    public void launch(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(driver.class.getResource("sellerHomepage.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 500, 480);
    stage.setTitle("Driftstore");
    stage.setScene(scene);
    stage.show();
    }
    public void close(Stage stage) throws IOException{
        stage.hide();
    }
}
