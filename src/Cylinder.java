public class Cylinder implements CylinderFormulas {
    int radius;
    int height;
    double PI = Math.PI;

    @Override
    public double areaCylinder() {
        return 2 * PI * radius * (height + radius);
    }
    public double volumeOfCylinder() {
        return PI * radius * radius * height;
    }
}
