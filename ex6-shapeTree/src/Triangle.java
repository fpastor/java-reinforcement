//
//  Triangle.java
//  ex6-shapeTree
//
//  Created by Fernando Pastor on 31/7/24
//

public class Triangle implements Shape {

    double height;
    double base;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    public String toString() {
        return String.format("%.2f", getArea()) + ";Triangle";
    }

}