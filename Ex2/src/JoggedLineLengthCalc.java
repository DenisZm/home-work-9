/**
 * Calculate jogged line length
 * Created by denis on 18.12.16.
 */
public class JoggedLineLengthCalc {
    public static void main(String[] args) {
        JoggedLine jLine;

        System.out.println("Input first point coordinates");
        Point point1 = createPoint();
        System.out.println("\nInput second point coordinates");
        Point point2 = createPoint();

        jLine = new JoggedLine(point1, point2);

        boolean exitFlag = false;
        while (!exitFlag) {
            printLineCoordinates(jLine);
            System.out.println("1 - add point");
            System.out.println("2 - calculate line length");
            System.out.print("select[1,2]: ");
                switch (Helper.getUserInput(1,2)) {
                    case 1:
                        System.out.println("\nInput point coordinates");
                        Point p = createPoint();
                        jLine.add(p);
                        break;
                    case 2:
                        System.out.println("\nLine length: " +jLine.length());
                        exitFlag = true;
                        break;
                }
        }
    }

    private static void printLineCoordinates(JoggedLine jLine) {
        System.out.print("\nLine coordinates:");
        System.out.println(jLine);
    }

    private static Point createPoint() {
        System.out.printf("X: ");
        double x = Helper.getDoubleFromUser();
        System.out.printf("Y: ");
        double y = Helper.getDoubleFromUser();
        return new Point(x,y);
    }
}
