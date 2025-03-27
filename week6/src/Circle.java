public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius,) {
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius == 0) {
            throw new IllegalArgumentException("Side cannot be negative");

        } else {
            this.radius = radius;
        }
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}