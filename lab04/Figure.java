abstract class Figure {
    abstract double calculateArea();
    abstract Point centroid();
    abstract boolean isDegenerate();
    public abstract String toString();

    double findLengthSide(Point A, Point B) {
        return (double) Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
    }
}
