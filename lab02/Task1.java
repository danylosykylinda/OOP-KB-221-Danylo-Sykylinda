package lab02;

public class Task1 {
   
    public static void main(String[] args) {
        Task1 task1 = new Task1();

        Line line1 = task1.new Line(1,1); 
        Line line2 = task1.new Line(-1,3); 
        if (line1.intersection(line2) == null) {
            System.out.println("These lines are parallel or coincide, there is no intersection point.");
        }
        else {
            System.out.println("The intersection point is: "+line1.intersection(line2));
        }
    }
    
    public class Line {
        private double k, b;

        public Line(double k, double b) {
            this.k = k;
            this.b = b;
        }

        public Point intersection(Line secondLine) {
            if ((this.k == secondLine.k && this.b != secondLine.b) || (this.k == secondLine.k && this.b == secondLine.b)) {
                return null;
            }
            else {
                double x = (secondLine.b - this.b)/(this.k - secondLine.k);
                double y = this.k * x + this.b;
                return new Point(x, y);
            }
        }
        
    }

    public class Point {
        private double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public String toString() {
            return "(" + x + "; " + y + ")";
        }
    }
}
