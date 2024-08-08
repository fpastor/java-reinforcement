//
//  ICanvas.java
//  canvas
//
//  Created by Fernando Pastor on 08/08/2024
//

public interface ICanvas {

    void setColor(Color color);
    void drawRectangle(Rect2D rect2D);
    void drawCircle(Rect2D rect2D);
    void drawPolygon(Point2D[] points);

}
