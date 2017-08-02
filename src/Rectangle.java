public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double area(){
        double aValue = length * width;
        return aValue;
    }
    public String toString(){
        String encodedLine;
        encodedLine = getColor() + " rectangle with length of " + length + ", a width of " + width + ", and area of " + area() + ".";
        return encodedLine;
    }
}