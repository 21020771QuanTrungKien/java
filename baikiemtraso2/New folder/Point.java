public class Point {
    private double pointX;
    private double pointY;

    /**
     * point.
     */
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point other) {
        return Math.sqrt(Math.pow((this.pointX - other.getPointX()), 2)
                + Math.pow((this.pointY - other.getPointY()), 2));
    }
}
