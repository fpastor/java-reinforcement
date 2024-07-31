//
//  Circle.java
//  ex6-shapeTree
//
//  Created by Fernando Pastor on 31/7/24
//

public class Circle implements Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return String.format("%.2f", getArea()) + ";Circle";
    }

}