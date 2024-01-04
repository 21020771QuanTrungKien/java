public class Triangle implements GeometricObject{
    private Point p1;
    private Point p2;
    private Point p3;

    private double a1;
    private double b1;
    private double c1;

    /**
     * RuntimeException.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException{
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.a1 = this.p1.distance(p2);
        this.b1 = this.p2.distance(p3);
        this.c1 = this.p3.distance(p1);
        if (a1 + b1 >= c1 || b1 + c1 >= a1 || a1 + c1 >= b1) {
            throw new RuntimeException();
        }
        if (getP1() == getP2() || getP1() == getP3() || getP2() == getP3()) {
            throw new RuntimeException();
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public double getArea() {
        return (Math.sqrt((a1 + b1 + c1) * (a1 + b1 - c1) * (b1 + c1 - a1) * (c1 + a1 - b1))) / 4;
    }

    @Override
    public double getPerimeter() {
        return (a1 + b1 + c1);
    }

    @Override
    public String getInfo() {
        return "Triangle[" + p1 + "," + p2 + "," + p3 + "]";
    }
}

