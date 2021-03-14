public class CircleRunner {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        System.out.print("circumference of Circle 1 is " );
        c.CalculateArea( );
        int r = c.getRadius();
        Circle c2 = new Circle(r);
        c2.setRadius(5);
        System.out.print("circumference of Circle 2 is " ); c2.CalculateArea( );

    }
}
