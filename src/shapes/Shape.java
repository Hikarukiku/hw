package shapes;

/**
 * Created by hikarukiku on 16.10.16.
 */
abstract public class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.color = "yellow";
        this.filled = false;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}
