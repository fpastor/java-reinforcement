//
//  Rect2D.java
//  canvas
//
//  Created by Fernando Pastor on 08/08/2024
//

public class Rect2D {

    double x1;
    double y1;
    double x2;
    double y2;

    Rect2D() {
    }

    Rect2D(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Rect2D(Point2D point1, Point2D point2) {
        this.x1 = point1.x;
        this.y1 = point1.y;
        this.x2 = point2.x;
        this.y2 = point2.y;
    }

}

