public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = Math.max(0, radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

}
