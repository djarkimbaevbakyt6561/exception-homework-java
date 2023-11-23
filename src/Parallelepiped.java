public class Parallelepiped implements ParallelepipedFormulas {
     int height;
     int length;
     int width;
    public Parallelepiped() {
    }

    public Parallelepiped(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public int areaParallelepiped() {
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    public int volumeOfParallelepiped() {
        return length * width * height;
    }
}
