//
//  Main.java
//  ex6-shapeTree
//
//  Created by Fernando Pastor on 31/7/24
//

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Shape> shapeTreeSet = new TreeSet<>(new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return Double.compare(s1.getArea(), s2.getArea());
            }
        });

        shapeTreeSet.add(new Circle(5));
        shapeTreeSet.add(new Circle(10));
        shapeTreeSet.add(new Rectangle(10,10));
        shapeTreeSet.add(new Rectangle(20, 20));
        shapeTreeSet.add(new Triangle(20,20));
        shapeTreeSet.add(new Triangle(15,15));

        for (Shape shape : shapeTreeSet) {
            System.out.println(shape.toString());
        }

    }
}