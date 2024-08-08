//
//  CanvasConsole.java
//  canvas
//
//  Created by Fernando Pastor on 08/08/2024
//

public class CanvasConsole implements ICanvas {

    double width;
    double height;
    Color currentColor;

    @Override
    public void setColor(Color color) {
        currentColor = color;
    }

    @Override
    public void drawRectangle(Rect2D rect2D) {
        System.out.printf("* Drawing a rectangle of [%s,%s,%s,%s] color in (%s,%s,%s,%s).%n",
                currentColor.r, currentColor.g, currentColor.b, currentColor.a,
                rect2D.x1, rect2D.y1, rect2D.x2, rect2D.y2);
    }

    @Override
    public void drawCircle(Rect2D rect2D) {
        System.out.printf("* Drawing a circle of [%s,%s,%s,%s] color in rectangle (%s,%s,%s,%s).%n",
                currentColor.r, currentColor.g, currentColor.b, currentColor.a,
                rect2D.x1, rect2D.y1, rect2D.x2, rect2D.y2);
    }

    @Override
    public void drawPolygon(Point2D[] points) {
        System.out.print("* Drawing a polygon with the points: ");
        for(Point2D point : points)
            System.out.printf("(%s,%s) ", point.x, point.y);
        System.out.println();
    }

}
