public class Box {
    private int whdth;
    private int length;
    private int height;
    private int volume;

    Box(int w, int l, int h) {
        whdth = w;
        length = l;
        height = h;
        volume = whdth * length * height;
    }

    public int getVolume() {
        return volume;
    }
}
