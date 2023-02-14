package project;

import MyExep.UnValidNumber;
import MyExep.negativeValueException;

public class Geometry {

    private double length;
    private double width;
    private double radius;
    private double base;
    private double height;

    public double RectangleArea(double length, double width) {
        double Area = length * width;
        try {
            validArea(Area);
            return Area;
        } catch (negativeValueException n) {
            System.out.println("This Area not Valid");
        }
        return 0;
    }

    public double circleArea(double radius) {
        double Area = Math.PI * Math.pow(radius, 2);
        try {
            validArea(Area);
            return Area;
        } catch (negativeValueException n) {
            System.out.println("This Area not Valid");
        }
        return 0;
    }

    public double TraingleArea(double area, double height) {
        double Area = 0.5 * base* height;
        try {
            validArea(Area);
            return Area;
        } catch (negativeValueException n) {
            System.out.println("This Area not Valid");
        }
        return 0;
    }

    public void validArea(double area) throws negativeValueException {
        if (area < 0) {
            throw new negativeValueException("This Area not Valid");
        } else {
            area = area;
        }
    }

    public boolean checkNum(int num) throws UnValidNumber {
        if (num >= 1 && num <= 4) {
            return true;
        } else {
            throw new UnValidNumber("\nSorry , The Number outside range from 1 to 4");
        }
    }

}
