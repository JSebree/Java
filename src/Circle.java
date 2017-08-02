public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        double aValue = Math.PI * radius * radius;
        return aValue;
    }

    public String toString() {
        String encodedLine;
        encodedLine = getColor() + " circle with radius of " + radius + " and area of " + area() + ".";
        return encodedLine;
    }
}