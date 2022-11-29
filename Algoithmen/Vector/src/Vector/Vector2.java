package Vector;

/**
 * Created: 25.02.2022
 *
 * @author Maximilian Ertl (Maimiian Ertl)
 */
public class Vector2 extends Vector{
    private double y;

    public double getY() {
        return y;
    }

    public Vector2() {
        this(1,1);
    }

    public Vector2(double x, double y) {
        super(x);
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString() + ", y : " + y;
    }

    @Override
    public double magnitude(double x) {
        return Math.sqrt(x*x + y*y);
    }

    public static double disance(Vector v1, Vector v2) {
        double x = v2.x - v1.x;
        double y = v2.y - v1.y;
        return Math.abs(x*x + y*y);
    }
}
