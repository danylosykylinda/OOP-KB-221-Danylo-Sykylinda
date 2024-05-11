public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(0,0), new Point(5, 0), new Point(0,12));
        System.out.println(triangle.isDegenerate() ? "The triangle is degenerate." : "The triangle isn't degenerate.");
        System.out.println("The area of the triangle is: " + String.format("%.3f", triangle.calculateArea()));
        System.out.println("The centroid of the triangle is: " + triangle.centroid());
        System.out.println(triangle + "\n");

        Quadrilateral quadrilateral = new Quadrilateral(new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(1, 0));
        System.out.println(quadrilateral.isDegenerate() ? "The quadrilateral is degenerate." : "The quadrilateral isn't degenerate.");
        System.out.println("The area of the quadrilateral is: " + String.format("%.3f", quadrilateral.calculateArea()));
        System.out.println("The centroid of the quadrilateral is: " + quadrilateral.centroid());
        System.out.println(quadrilateral + "\n");

        Circle circle = new Circle(new Point(0, 5), 1);
        System.out.println(circle.isDegenerate() ? "The circle is degenerate." : "The circle isn't degenerate.");
        System.out.println("The length of the circle is: " + String.format("%.3f", circle.calculateArea()));
        System.out.println("The centroid of the circle is: " + circle.centroid());
        System.out.println(circle + "\n");
    }
}
