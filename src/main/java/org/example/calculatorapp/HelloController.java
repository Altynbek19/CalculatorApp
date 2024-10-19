package org.example.calculatorapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;


public class HelloController {
    Calculator calc = new Calculator();

    @FXML
    private void clearFields() {
        text.setText("");
    }

    @FXML
    private Label text;

    @FXML
    void onClick0(){
        String val = text.getText();
        if (!val.equals("0")) {
            val = val + "0"; // добавляем 0 только если текущее значение не "0"
        }

        text.setText(val);
//        String val = text.getText();
//        val = val + "0";
//        text.setText(val);
    }

    @FXML
    void onClickBut1(){
        String val = text.getText();
        if (val.equals("0")) {
            val = "1"; // заменяем "0" на "1"
        } else {
            val += "1"; // добавляем "1"
        }
        text.setText(val);
//        String val = text.getText();
//        val = val + "1";
//        text.setText(val);
    }

    @FXML
    void onClickBut2(){
        String val = text.getText();
        if (val.equals("0")) {
            val = "2"; // заменяем "0" на "2"
        } else {
            val += "2"; // добавляем "2"
        }
        text.setText(val);
//        text.setText(val);
//        String val = text.getText();
//        val = val + "2";
//        text.setText(val);
    }


    @FXML
    void onClickBut3(){
        String val = text.getText();
        if (val.equals("0")) {
            val = "3"; // заменяем "0" на "3"
        } else {
            val += "3"; // добавляем "3"
        }
        text.setText(val);
//        text.setText(val);
//        String val = text.getText();
//        val = val + "3";
//        text.setText(val);
    }


    @FXML
    void onClickBut4(){
        String val = text.getText();
        if (val.equals("0")) {
            val = "4"; // заменяем "0" на "4"
        } else {
            val += "4"; // добавляем "4"
        }
        text.setText(val);
//        text.setText(val);
//        String val = text.getText();
//        val = val + "4";
//        text.setText(val);
    }

    @FXML
    void onClickBut5(){
        String val = text.getText();
        if (val.equals("0")) {
            val = "5"; // заменяем "0" на "5"
        } else {
            val += "5"; // добавляем "5"
        }
        text.setText(val);
//        text.setText(val);
//        String val = text.getText();
//        val = val + "5";
//        text.setText(val);
    }


    @FXML
    void onClickBut6(){
        String val = text.getText();
        if (val.equals("0")) {
            val = "6"; // заменяем "0" на "6"
        } else {
            val += "6"; // добавляем "6"
        }
        text.setText(val);
//        text.setText(val);
//        String val = text.getText();
//        val = val + "6";
//        text.setText(val);
    }


    @FXML
    void onClickBut7(){
        String val = text.getText();
        if (val.equals("0")) {
            val = "7"; // заменяем "0" на "7"
        } else {
            val += "7"; // добавляем "7"
        }
        text.setText(val);
//        text.setText(val);
//        String val = text.getText();
//        val = val + "7";
//        text.setText(val);
    }


    @FXML
    void onClickBut8(){
        String val = text.getText();
        if (val.equals("0")) {
            val = "8"; // заменяем "0" на "8"
        } else {
            val += "8"; // добавляем "8"
        }
        text.setText(val);
//        text.setText(val);
//        String val = text.getText();
//        val = val + "8";
//        text.setText(val);
    }


    @FXML
    void onClickBut9(){
        String val = text.getText();
        if (val.equals("0")) {
            val = "9"; // заменяем "0" на "9"
        } else {
            val += "9"; // добавляем "9"
        }
        text.setText(val);
//        text.setText(val);
//        String val = text.getText();
//        val = val + "9";
//        text.setText(val);
    }


    @FXML
    private void onPlusClick(){
        String op1 = text.getText();
        text.setText("");

        calc.setOp1( Integer.parseInt(op1) );
        calc.setOperator('+');

    }

    @FXML
    private void onMulClick(){
        String op1 = text.getText();
        text.setText("");

        calc.setOp1( Integer.parseInt(op1) );
        calc.setOperator('*');

    }

    @FXML
    private void onDevClick(){
        if (calc.getOperator() == '/' && calc.getOp2() == 0) {
            showAlert("Ошибка", "Деление на ноль недопустимо!");
            return; // Прекращаем выполнение, если деление на ноль
        }
        String op1 = text.getText();
        text.setText("");

        calc.setOp1( Integer.parseInt(op1) );
        calc.setOperator('/');

    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void onMinusClick(){
        String op1 = text.getText();
        text.setText("");

        calc.setOp1( Integer.parseInt(op1) );
        calc.setOperator('-');

    }

    @FXML
    private void onEqualClick() {

        String op2 = text.getText();
        calc.setOp2(Integer.parseInt(op2));
        calc.calculate();
        text.setText("" + calc.getResult());

    }
    @FXML
    private void onConvertoMinusClick() {
        String op1 = text.getText();

        // Проверяем, если строка не пустая и не равна "0"
        if (!op1.isEmpty() && !op1.equals("0")) {
            int number = Integer.parseInt(op1);

            // Меняем знак числа
            number = -number;

            // Устанавливаем новое значение в текстовое поле
            text.setText(String.valueOf(number));

            // Устанавливаем операнды и оператор (если нужно)
            calc.setOp1(number);
            calc.setOperator('N'); // Этот оператор можно использовать для обозначения операции смены знака
        }
    }
}