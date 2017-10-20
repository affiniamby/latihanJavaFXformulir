/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaproyek1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLLatihanController implements Initializable {

    @FXML
    private TextField Nama;
    @FXML
    private TextField Alamat;
    @FXML
    private TextField Absen;
    @FXML
    private TextField Telepon;
    @FXML
    private JFXButton Proses;
    @FXML
    private JFXTextArea Hasil;
    @FXML
    private JFXButton Hapus;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void namaa(ActionEvent event) {
    }

    @FXML
    private void alamatt(ActionEvent event) {
    }

    @FXML
    private void absenn(ActionEvent event) {
    }

    @FXML
    private void teleponn(ActionEvent event) {
    }
    @FXML
    private void prosess(ActionEvent event) {
         String nama = Nama.getText();
         String alamat = Alamat.getText();
         String absen = Absen.getText();
         String telepon = Telepon.getText();
         
         Hasil.setText("Nama Anda"+nama+"\n Alamat"+alamat+"\n Absen"+absen+"\n Telepon"+telepon+"");
    }
     @FXML
    void hapus(ActionEvent event) {
        Hasil.setText("");
        Nama.setText("");
        Absen.setText("");
        Alamat.setText(" ");
        Telepon.setText(" ");
        
    }
}
