package shapes;

/**
 * Created by hikarukiku on 16.10.16.
 */
public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.filled = false;
        this.color = "green";
        this.length = 2;
        this.width = 3;
    }

    public Rectangle(double width, double length){
        this.filled = false;
        this.color = "green";
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.filled = filled;
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Shape: rectangle, length: "+this.length+", width: "+this.width;
    }
}
