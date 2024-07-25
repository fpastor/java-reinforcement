//
//  Triangle.java
//  ex4-shapeComparator
//
//  Created by Fernando Pastor on 24/7/24.
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
}
