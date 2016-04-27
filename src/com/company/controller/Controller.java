package com.company.controller;

import com.company.model.Model;
import com.company.view.View;

import java.util.Scanner;

/**
 * Created by Женя on 27.04.2016.
 */
public class Controller {

    Model model;
    View view;

    // Counstructor
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    // The work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        view.printMessage(View.GREETING);
        view.printMessage(View.ENTER_SIDE_A);
        model.setSideA(inputIntSideValue(sc));
        view.printMessage(View.ENTER_SIDE_B);
        model.setSideB(inputIntSideValue(sc));
        view.printMessage(View.ENTER_ANGLE);
        model.setAngle(inputIntAngleValue(sc));
        view.printTriangleArea(model.area());
    }

    // The Utility methods

    /**
     * This method reads input value for triangle side with scanner and makes all needed check of data
     * @param sc Scanner
     * @return valid input data
     */
    public int inputIntSideValue(Scanner sc){
        boolean inputIsValid = false;
        int inputValue = 0;

        while (!inputIsValid) {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_DATA);
            }

            inputValue = sc.nextInt();

            if (inputValue > 0){
                inputIsValid = true;
            }else{
                String message = View.NEGATIVE_SIDE_LENGTH + View.TRY_AGAIN;
                view.printMessage(message);
            }
        }

        return inputValue;
    }

    /**
     * This method reads intput value for triangle angle with scanner and makes all needed check of data
     * @param sc Scanner
     * @return valid input data
     */
    public int inputIntAngleValue(Scanner sc){
        boolean inputIsValid = false;
        int inputValue = 0;

        while (!inputIsValid) {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_DATA);
            }

            inputValue = sc.nextInt();

            if (inputValue >= 0 && inputValue <= 180){
                inputIsValid = true;
            }else{
                String message = View.WRONG_ANGLE_DEGREE + View.TRY_AGAIN;
                view.printMessage(message);
            }
        }

        return inputValue;
    }
}
