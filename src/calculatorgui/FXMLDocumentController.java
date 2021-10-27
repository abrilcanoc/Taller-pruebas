/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorgui;

import businessLogic.Calculadora;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Anabel
 */
public class FXMLDocumentController implements Initializable {
    
    private float data;
    private int operation = -1;
    
    @FXML
    private Button one;

    @FXML
    private Button eight;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button five;

    @FXML
    private Button seven;

    @FXML
    private Button four;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button mult;

    @FXML
    private Button zero;

    @FXML
    private Button equals;

    @FXML
    private Button clear;

    @FXML
    private Button div;
    
    @FXML
    private Button back;

    @FXML
    private Button mod;

    @FXML
    private Button signo;

    @FXML
    private Button coma;

    @FXML
    private Button tenPow;

    @FXML
    private Button sqrt;

    @FXML
    private Button nFact;

    @FXML
    private Button log;


    @FXML
    private TextField display;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == clear) {
            display.setText("");
        }
        else if (event.getSource() == plus) {
            data = Float.parseFloat(display.getText());
            operation = 1; //Addition
            display.setText("");
        } else if (event.getSource() == minus) {
            data = Float.parseFloat(display.getText());
            operation = 2; //Substraction
            display.setText("");
        } else if (event.getSource() == mult) {
            data = Float.parseFloat(display.getText());
            operation = 3; //Mul
            display.setText("");
        } else if (event.getSource() == div) {
            data = Float.parseFloat(display.getText());
            operation = 4; //Division
            display.setText("");
        }else if (event.getSource() == back) {
            String str = display.getText();
            str = str.substring(0, str.length()-1);
            display.setText(str);
        }else if (event.getSource() == mod) {
            data = Float.parseFloat(display.getText());
            operation = 5; //Modulo
            display.setText("");
        }else if (event.getSource() == signo) {
            data = Float.parseFloat(display.getText());
            String str = display.getText();
            if (data>0){
                str = "-"+str;
            }else{
                str = str.substring(1, str.length());
            }
            display.setText(str);
        }else if (event.getSource() == coma) {
            String str = display.getText();
            str = str +".";
            display.setText(str);
        }else if (event.getSource() == tenPow) {
            System.out.println("Boton");
            data = Float.parseFloat(display.getText());
            operation = 6; //10x
        }else if (event.getSource() == sqrt) {
            data = Float.parseFloat(display.getText());
            operation = 7; //raiz
        }else if (event.getSource() == nFact) {
            data = Float.parseFloat(display.getText());
            operation = 8; //fact
        }else if (event.getSource() == log) {
            data = Float.parseFloat(display.getText());
            operation = 9; //log
        }
        
        
        else if (event.getSource() == equals) {
            float secondOperand = Float.parseFloat(display.getText());
            switch (operation) {
                case 1: //Addition
                    float ans = Calculadora.add(data, secondOperand);
                    display.setText(String.valueOf(ans));break;
                case 2: //Subtraction
                    ans = Calculadora.substract(data, secondOperand);
                    display.setText(String.valueOf(ans));break;
                case 3: //Mul
                    ans = Calculadora.multiply(data, secondOperand);
                    display.setText(String.valueOf(ans));break;
                case 4: //Div
                    ans = 0f;
                    ans = Calculadora.div(data, secondOperand);
                    if (ans>0){
                        display.setText(String.valueOf(ans));break;
                    }else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Error");
                        alert.setHeaderText("No es posbile realizar esta operacion");
                        alert.setContentText("División en cero");
                        alert.showAndWait();
                        display.setText("");
                    }
                case 5: //Mod
                    ans = 0f;
                    ans = Calculadora.mod(data, secondOperand);                    
                    display.setText(String.valueOf(ans));break;
                case 6: //10x
                    System.out.println("FML");
                    ans = 0f;
                    ans = Calculadora.pow(data, secondOperand); 
                    System.out.println(ans);
                    display.setText(String.valueOf(ans));break;
                case 7: //raiz
                    ans = 0f;
                    ans = Calculadora.raiz(data);
                    if (ans>0){
                        display.setText(String.valueOf(ans));break;
                    }else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Error");
                        alert.setHeaderText("No es posbile realizar esta operacion");
                        alert.setContentText("Respuesta no real \n intente con numeros positivos");
                        alert.showAndWait();
                        display.setText("");
                    }
                case 8: //fact
                    ans = 0f;
                    ans = Calculadora.fac(data);                    
                    display.setText(String.valueOf(ans));break;
                case 9: //log
                    ans = 0f;
                    ans = Calculadora.log(data);
                    if (ans>0){
                        display.setText(String.valueOf(ans));break;
                    }else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Error");
                        alert.setHeaderText("No es posbile realizar esta operacion");
                        alert.setContentText("Respuesta no real \n intente con numeros positivos");
                        alert.showAndWait();
                        display.setText("");
                    }
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
