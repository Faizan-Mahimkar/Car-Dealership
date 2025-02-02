package com.miniProject.carDealership;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class carListController {
    loginController login = new loginController();
    @FXML
    private javafx.scene.control.Button goBack;
    @FXML
    private TextField manufacturer;
    @FXML
    private TextField model;
    @FXML
    private TextField registrationNumber;
    @FXML
    private TextField price;
    @FXML
    private TextField chassisNumber;
    @FXML
    private TextField yearOfManufacture;
    @FXML
    public void onGoBackClicked() throws IOException {
        close();
        login.openHomepage();
    }
    public void onConfirmButtonClicked() throws IOException {
        dbCars carDb = new dbCars();
        String man = manufacturer.getText();
        String mod = model.getText();
        String reg = registrationNumber.getText();
        int pri = Integer.parseInt(price.getText());
        int year = Integer.parseInt(yearOfManufacture.getText());
        String chassis = chassisNumber.getText();
        carDb.insertCarDetails(man, mod, reg, pri, year, chassis);
        close();
        login.openHomepage();
    }
    public void launch() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(driver.class.getResource("carList.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 570, 585);
        Stage stage = new Stage();
        stage.setTitle("Driftstore");
        stage.setScene(scene);
        stage.show();
    }
    public void close(){
        Stage stage = (Stage) goBack.getScene().getWindow();
        stage.hide();
    }
}
