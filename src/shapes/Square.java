package shapes;

/**
 * Created by hikarukiku on 16.10.16.
 */
public class Square extends Rectangle {
    public Square(){
        color = "pink";
        filled = false;
        length = 0;
        width = 0;
    }

    public Square(double side){
        color = "pink";
        filled = false;
        length = side;
        width = side;
    }

    public Square(double side, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        length = side;
        width = side;
    }

    public void setSide(double side){
        length = side;
        width = side;
    }

    public double getSide(){
        return length;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Shape: square, side: "+this.length;
    }
}
