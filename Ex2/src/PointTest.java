/**
 * Test Point & JoggedLine objects override toString method
 * Created by denis on 18.12.16.
 */
public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);
        Point point3 = new Point(3, 3);
        Point point4 = new Point(4, 4);

        System.out.println(point1);

        JoggedLine jLine = new JoggedLine(point1, point2);
        jLine.add(point3);
        jLine.add(point4);

        System.out.println(jLine);
        System.out.println(jLine.length());
    }
}
