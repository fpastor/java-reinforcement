//
//  Rectangle.java
//  ex6-shapeTree
//
//  Created by Fernando Pastor on 31/7/24
//

public class Rectangle implements Shape {

    double side1;
    double side2;

    Rectangle (double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    public String toString() {
        return String.format("%.2f", getArea()) + ";Rectangle";
    }

}