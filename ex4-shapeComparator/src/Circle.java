//
//  Circle.java
//  ex4-shapeComparator
//
//  Created by Fernando Pastor on 24/7/24.
//

public class Circle implements Shape {

    double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
