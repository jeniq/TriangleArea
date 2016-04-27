package com.company.model;

/**
 * Created by Женя on 27.04.2016.
 */
public class Model {
    int sideA;
    int sideB;
    int angle; // degrees

    // The Program logic

    /**
     * This method counts triangle's area
     * @return area's value
     */
    public double area(){
        double radians = Math.toRadians(angle);
        return 0.5 * sideA * sideB * Math.sin(radians);
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

}
