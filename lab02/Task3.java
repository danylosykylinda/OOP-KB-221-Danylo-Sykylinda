package lab02;

import lab02.Task1.Point;

public class Task3 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task3 task3 = new Task3();

        Triangle triangle = task3.new Triangle(task1.new Point(0,0), task1.new Point(5, 0), task1.new Point(0,12));
        System.out.println("Length of side AB: " + triangle.getLengthAB());
        System.out.println("Length of side BC: " + triangle.getLengthBC());
        System.out.println("Length of side AC: " + triangle.getLengthAC());
        System.out.println(triangle.isDegenerateTriangle(triangle.getLengthAB(), triangle.getLengthBC(), triangle.getLengthAC()));
        System.out.println("\nThe area of the triangle is: " + triangle.calculateArea());
        System.out.println("The centroid of the triangle is: " + triangle.calculateCentroid());
    }

    public class Triangle {
        Task1 task1 = new Task1();
        private Point pointA, pointB, pointC;

        public Triangle(Point pointA, Point pointB, Point pointC) {
            this.pointA = pointA;
            this.pointB = pointB;
            this.pointC = pointC;
        }
        
        public double calculateLengthOfSide(Point point1, Point point2) {
            double vectorPointX = point2.getX() - point1.getX();
            double vectorPointY = point2.getY() - point1.getY();
            return Math.sqrt(Math.pow(vectorPointX,2) + Math.pow(vectorPointY, 2));
        }

        public double getLengthAB() {
            return calculateLengthOfSide(pointA, pointB);
        }

        public double getLengthBC() {
            return calculateLengthOfSide(pointB, pointC);
        }

        public double getLengthAC() {
            return calculateLengthOfSide(pointC, pointA);
        }

        public String isDegenerateTriangle(double a, double b, double c) {
            if (!(a + b > c && b + c > a && c + a > b)) {
                throw new IllegalArgumentException("The triangle does not exist and/or is degenerate.");
            }
            else {
                return "This triangle exists and is not degenerate.";
            }
        }

        public double calculateArea() {
            double p = (getLengthAB() + getLengthBC() + getLengthAC()) / 2;
            double areaOfTriangle = Math.sqrt(p*(p - getLengthAB()) * (p - getLengthBC()) * (p - getLengthAC()));
            return areaOfTriangle;
        }

        public Point calculateCentroid() {
            double centroidPointX = (pointA.getX() + pointB.getX() + pointC.getX()) / 3; 
            double centroidPointY = (pointA.getY() + pointB.getY() + pointC.getY()) / 3; 
            return task1.new Point(centroidPointX, centroidPointY);
        }
    }
}
