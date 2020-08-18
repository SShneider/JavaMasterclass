public class Floor {
    private double width;
    private double height;

    public Floor(double width, double height) {
        this.width = Math.max(0, width);
        this.height = Math.max(0, height);
    }
    public double getArea(){
        return this.width*this.height;
    }
}
