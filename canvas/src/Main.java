//
//  Main.java
//  canvas
//
//  Created by Fernando Pastor on 08/08/2024
//

public class Main {
    public static void main(String[] args) {

        welcome();

        CanvasConsole canvasConsole = new CanvasConsole();
        Color red = new Color(255,0,0,0);
        canvasConsole.setColor(red);

        Point2D point1 = new Point2D(0,0);
        Point2D point2 = new Point2D(10,10);

        Rect2D rect1 = new Rect2D(point1, point2);

        Point2D[] polygon1 = new Point2D[2];
        polygon1[0] = point1;
        polygon1[1] = point2;
        canvasConsole.drawRectangle(rect1);
        canvasConsole.drawCircle(rect1);
        canvasConsole.drawPolygon(polygon1);
    }

    private static void welcome() {
        System.out.println("-----------------------");
        System.out.println("- CANVAS... ¡IN JAVA! -");
        System.out.println("-----------------------");
        System.out.println();
    }

}