package com.company.test

import com.company.model.Model
import org.junit.Test

import static org.junit.Assert.*;

/**
 * Created by Женя on 27.04.2016.
 */
class ModelTest {

    public static final double ACCURACY = 1e-10;

    @Test
    void correctTriangleArea(){
        Model area = new Model();
        area.setSideA(10);
        area.setSideB(10);
        area.setAngle(30);
        double result = area.area();
        assertEquals(25, result, ACCURACY);
    }

    @Test(expected = IllegalArgumentException)
    void testNegativeSidesLength() {
        Model area = new Model();
        area.setSideA(-10);
        area.setSideB(-10);
        area.setAngle(30);
        area.area();
    }

    @Test(expected = IllegalArgumentException)
    void testNegativeOneSideLength() {
        Model area = new Model();
        area.setSideA(-10);
        area.setSideB(10);
        area.setAngle(30);
        area.area();
    }

    @Test(expected = IllegalArgumentException)
    void testNegativeAngle() {
        Model area = new Model();
        area.setSideA(10);
        area.setSideB(10);
        area.setAngle(-30);
        area.area();
    }
}
