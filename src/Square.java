public class Square extends Shape{
    private double length;
    public Square(String color, double length){
        super(color);
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public double area(){
        double aValue = length * length;
        return aValue;
    }
    public String toString(){
        String encodedLine;
        encodedLine = getColor() + " square with length of " + length + " and area of " + area() + ".";
        return encodedLine;
    }
}