package Vector;


/**
 * Created: 25.02.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Vector {
    private double x;

    public Vector() {
        this(1);
    }

    public Vector(double x) {
        this.x = x;
    }

    public double getX(){
        return x;
    }

    @Override
    public String toString() {
        return "Vectorr " + "x : "+ x;
    }

    public double magnitude(double x) {
        return x;
    }

    public static double disance(Vector v1, Vector v2) {
        return Math.abs(v2.x - v1.x);
    }
}
