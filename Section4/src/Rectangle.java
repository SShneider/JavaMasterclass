public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = Math.max(0, length);
        this.width = Math.max(0, width);
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
    public double getArea(){
        return this.length*this.width;
    }
}
