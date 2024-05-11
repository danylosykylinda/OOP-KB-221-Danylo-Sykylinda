public class Quadrilateral extends Figure {
    private Point pointA, pointB, pointC, pointD;
    private double AB, BC, CD, AD, AC, BD;

    public Quadrilateral(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;

        findLengthAllSides();
        if (isDegenerate()) {
            throw new IllegalArgumentException("The quadrilateral is degenerate.");
        }
    }

    public void findLengthAllSides() {
        AB = findLengthSide(pointA, pointB);
        BC = findLengthSide(pointB, pointC);
        CD = findLengthSide(pointC, pointD);
        AD = findLengthSide(pointA, pointD);

        AC = findLengthSide(pointA, pointC);
        BD = findLengthSide(pointB, pointD);
    }

    @Override
    public boolean isDegenerate() {
        boolean condition1 = BC + CD + AD > AB;
        boolean condition2 = AB + CD + AD > BC;
        boolean condition3 = AB + BC + AD > CD;
        boolean condition4 = AB + BC + CD > AD;

        return !(condition1 && condition2 && condition3 && condition4);
    }

    @Override
    public double calculateArea() {
        double p = (AB + BC + CD + AD) / 2;
        return Math.sqrt((p - AB) * (p - BC) * (p - CD) * (p - AD) - 0.25*(AB * CD + BC * AD + AC * BD) * (AB * CD + BC * AD - AC * BD));
    }

    @Override
    public Point centroid() {
        double centroidPointX = (pointA.getX() + pointB.getX() + pointC.getX() + pointD.getX()) / 4; 
        double centroidPointY = (pointA.getY() + pointB.getY() + pointC.getY() + pointD.getY()) / 4; 
        return new Point(centroidPointX, centroidPointY);
    }

    @Override
    public String toString() {
        return "Quadrilateral[A(" + pointA.getX() + "," + pointA.getY() + ") B(" + pointB.getX() + "," + pointB.getY() + ") C(" + pointC.getX() + "," + pointC.getY() + ") D(" + pointD.getX() + "," + pointD.getY() +")]";
    }
}
