public class Wall {
    private double width;
    private double height;

    public Wall(double width, double height) {
        this.width = Math.max(width, 0);
        this.height = Math.max(height, 0);
    }
    public Wall(){

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.max(width, 0);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0);
    }
    public double getArea(){
        return this.height*this.width;
    }
}
