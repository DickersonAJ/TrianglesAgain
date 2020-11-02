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
    Point d = new Point(0, -2);
    Point e = new Point(-2, 3);
    Point f = new Point(5, 6);
    Triangle t = new Triangle(d, e, f);
    Triangle t2 = new Triangle(0, -2, -2, 3, 5, 6);
    System.out.println(t.getArea());
    System.out.println(t2.getArea());
  }

}
