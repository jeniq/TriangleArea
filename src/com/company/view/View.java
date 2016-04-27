package com.company.view;

/**
 * Created by Женя on 27.04.2016.
 */
public class View {

    // Text's constants
    public static final String GREETING = "You are welcome!\nLet's try count triangle's area" +
            " using only two sides and angle";
    public static final String ENTER_SIDE_A = "Enter integer length of first side:";
    public static final String ENTER_SIDE_B = "Enter integer length of second side:";
    public static final String ENTER_ANGLE = "Enter integer degree of angle:";
    public static final String NEGATIVE_SIDE_LENGTH = "Negative or zero side of triangle doesn't exist!\n";
    public static final String WRONG_ANGLE_DEGREE = "Triangle should have degree in range 0 - 180!";
    public static final String TRY_AGAIN = "Try enter value again:";
    public static final String WRONG_INPUT_DATA = "Input value is not integer. Please, enter integer number";
    public static final String RESULT = "The area of triangle is %.3f";

    /**
     * This method prints text message
     * @param message text to print
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     * This method prints message with triangle area
     * @param area triangle's area
     */
    public void printTriangleArea(double area){
        System.out.printf(RESULT, area);
    }
}
