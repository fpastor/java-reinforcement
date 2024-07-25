
public class ShapeComparator<T extends Shape, U extends Shape> {

    T shape1;
    U shape2;

    ShapeComparator (T shape1, U shape2) {
        this.shape1 = shape1;
        this.shape2 = shape2;
    }

    public T getShape1() {
        return shape1;
    }

    public void setShape1(T shape1) {
        this.shape1 = shape1;
    }

    public U getShape2() {
        return shape2;
    }

    public void setShape2(U shape2) {
        this.shape2 = shape2;
    }

    public void compare() {
        var shape1area = shape1.getArea();
        var shape2area = shape2.getArea();

        System.out.println();

        if (shape1area > shape2area) {
            System.out.println("The first shape is bigger than the second shape.");
        }
        else if (shape1area < shape2area) {
            System.out.println("The second shape is bigger than the first shape.");
        }
        else {
            System.out.println("The two shapes had the same area.");
        }
    }

}
