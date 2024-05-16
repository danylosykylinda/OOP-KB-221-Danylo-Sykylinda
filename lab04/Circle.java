public class Circle extends Figure{
    private Point centerPoint;
    private double radius;

    public Circle(Point centerOfCircle, double radius) {
        this.centerPoint = centerOfCircle;
        this.radius = radius;

        if (isDegenerate()) {
            throw new IllegalArgumentException("The circle is degenerate.");
        }
    }

    @Override
    public boolean isDegenerate() {
        return radius <= 0; 
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Point centroid() {
        return new Point(centerPoint.getX(), centerPoint.getY());
    }

    @Override
    public String toString() {
        return "Circle[(" + centerPoint.getX() + "," + centerPoint.getY() + ") " + radius + "]";
    }
}
