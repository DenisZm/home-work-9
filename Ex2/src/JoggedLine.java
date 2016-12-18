import java.util.ArrayList;

public class JoggedLine {
    private ArrayList<Point> joggedLine = new ArrayList<>();

    JoggedLine(Point a, Point b) {
        this.joggedLine.add(a);
        this.joggedLine.add(b);
    }

    void add(Point p) {
        this.joggedLine.add(p);
    }

    double length() {
        double len = 0;

        for (int i = 1; i < joggedLine.size(); i++) {
            len += vectorLength(joggedLine.get(i), joggedLine.get(i - 1));
        }
        return len;
    }

    private double vectorLength(Point a, Point b) {
        double x = Math.abs(a.getX() - b.getX());
        double y = Math.abs(a.getY() - b.getY());

        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public String toString() {
        return joggedLine.toString();
    }
}
