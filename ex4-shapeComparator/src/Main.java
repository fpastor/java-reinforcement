//
//  Main.java
//  ex4-shapeComparator
//
//  Created by Fernando Pastor on 24/7/24.
//

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(20,20);
        Triangle triangle = new Triangle(20,10);
        Circle circle = new Circle(100);

        ShapeComparator<Rectangle, Triangle> shapeComparator1 = new ShapeComparator<Rectangle, Triangle>(rectangle,triangle);
        shapeComparator1.compare();

        ShapeComparator<Rectangle, Circle> shapeComparator2 = new ShapeComparator<Rectangle, Circle>(rectangle,circle);
        shapeComparator2.compare();
    }

}