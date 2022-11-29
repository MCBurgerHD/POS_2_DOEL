package Vector;

/**
 * Created: 25.02.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Vector3 extends Vector2{
    private double z;

    public double getZ() {
        return z;
    }

    public Vector3() {
        this(1,1,1);
    }

    public Vector3(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + "z  : " + z;
    }

    @Override
    public double magnitude(double x) {
        return Math.sqrt(x * x + y * y + z*z);
    }

    @Override
    public double magnitude(double x) {
        double x = v2.x - v1.x;
        double y = v2.y - v1.y;
        double z = v2.z - v1.z
        return Math.abs(x*x + y*y + z*z);
    }
}
