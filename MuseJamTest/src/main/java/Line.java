/**
 * Created by prabh on 05/02/17.
 */
public class Line {
    private int m;
    private int b;

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Line(int m, int b) {
        this.m = m;
        this.b = b;
    }

    public static boolean intersect(Line line1, Line line2) {
        return !(line1.getM() == line2.getM() && line1.getB() != line2.getB());
    }

}
