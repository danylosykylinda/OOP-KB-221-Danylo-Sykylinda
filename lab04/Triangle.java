public class Triangle extends Figure {
    private Point pointA, pointB, pointC;
    private double AB, BC, AC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;

        findLengthAllSides();
        if (isDegenerate()) {
            throw new IllegalArgumentException("The triangle is degenerate.");
        }
    }

    public void findLengthAllSides() {
        AB = findLengthSide(pointA, pointB);
        BC = findLengthSide(pointB, pointC);
        AC = findLengthSide(pointA, pointC);
    }

    @Override
    public boolean isDegenerate() {
        return !(AB + BC > AC && BC + AC > AB && AC + AB > BC); 
    }

    @Override
    public double calculateArea() {
        double p = (AB + BC + AC) / 2;
        double areaOfTriangle = Math.sqrt(p*(p - AB) * (p - BC) * (p - AC));
        return areaOfTriangle;
    }

    @Override
    public Point centroid() {
        double centroidPointX = (pointA.getX() + pointB.getX() + pointC.getX()) / 3; 
        double centroidPointY = (pointA.getY() + pointB.getY() + pointC.getY()) / 3; 
        return new Point(centroidPointX, centroidPointY);
    }

    @Override
    public String toString() {
        return "Triangle[A(" + pointA.getX() + "," + pointA.getY() +") B(" + pointB.getX() + "," + pointB.getY() + ") C(" + pointC.getX() + "," + pointC.getY() + ")]";
    }
}
