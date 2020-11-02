public class PointTester {

  public static void main(String[] args) {
    Point a = new Point(1, 2);
    Point b = new Point(5, 2);
    Point c = new Point(1, 2);
    System.out.println(a.getX());
    System.out.println(a.getY());
    System.out.println(a.distanceTo(b));
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
  }

}
