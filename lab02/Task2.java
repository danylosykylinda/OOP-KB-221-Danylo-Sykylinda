package lab02;

import lab02.Task1.Point;

public class Task2 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        Segment firstSegment = task2.new Segment(task1.new Point(2, 7), task1.new Point(3, 9));
        Segment secondSegment = task2.new Segment(task1.new Point(3, 9), task1.new Point(2, 14));

        System.out.println("The length of the first segment is: " + firstSegment.lengthOfSegment());
        System.out.println("The length of the second segment is: " + secondSegment.lengthOfSegment());

        System.out.println("\nThe middle of the first segment is: " + firstSegment.middleOfSegment());
        System.out.println("The middle of the second segment is: " + secondSegment.middleOfSegment());

        if (firstSegment.intersection(secondSegment) == null) {
            System.out.println("\nThe two lines are parallel or coincident.");
        }
        else {
        System.out.println("\nThe point of the intersection of two segments is: " + firstSegment.intersection(secondSegment));
        }
    }
    
    public class Segment {
        Task1 task1 = new Task1();
        private Point startPoint, endPoint;

        public Segment(Point startPoint, Point endPoint) {
            if (startPoint.getX() == endPoint.getX() && startPoint.getY() == endPoint.getY()) {
                throw new IllegalArgumentException("The segment is degenerate: the start point is equal to the end point.");
            }
            
            this.startPoint = startPoint;
            this.endPoint = endPoint;            
        }

        public double lengthOfSegment() {
            return Math.sqrt(Math.pow((endPoint.getX() + startPoint.getX()),2)) + Math.pow((endPoint.getY() - startPoint.getY()), 2);
        }
    
    public Point middleOfSegment() {
        double x = (this.startPoint.getX() + this.endPoint.getX()) / 2;
        double y = (this.startPoint.getY() + this.endPoint.getY()) / 2;
        return task1.new Point(x, y);
    }

    public Point intersection(Segment another) {
        double x1 = this.startPoint.getX();
        double y1 = this.startPoint.getY();
        double x2 = this.endPoint.getX();
        double y2 = this.endPoint.getY();

        double x3 = another.startPoint.getX();
        double y3 = another.startPoint.getY();
        double x4 = another.endPoint.getX();
        double y4 = another.endPoint.getY();
        
        double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (denominator == 0) {
            return null; 
        }

        double t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / denominator;
        double u = -((x1 - x2) * (y1 - y3) - (y1 - y2) * (x1 - x3)) / denominator;

        if (t >= 0 && t <= 1 && u >= 0 && u <= 1) {
            double intersectionPointX = x1 + t*(x2 - x1);
            double intersectionPointY = y1 + t*(y2 - y1);
            return task1.new Point(intersectionPointX, intersectionPointY);
        }
        else {
            return null; 
        }
    }
    }
}
