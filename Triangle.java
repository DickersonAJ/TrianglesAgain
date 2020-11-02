public class Triangle {
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    Point a = new Point(x1, y1);
    Point b = new Point(x2, y2);
    Point c = new Point(x3, y3);
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public double getPerimeter() {
    return (v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1));
  }

  public double getArea() {
    double s = getPerimeter() / 2;
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    return (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
  }

  public double round(double d) {
    d = d * 10000;
    d = d - (d % 1);
    d = d / 10000;
    return d;
  }

  public String classify() {
    double s1 = round(v1.distanceTo(v2));
    double s2 = round(v2.distanceTo(v3));
    double s3 = round(v3.distanceTo(v1));
    if ((s1 == s2) && (s1 == s3)) {
      return ("equilateral");
    }
    else if ((s1 == s2) || (s2 == s3) || (s3 == s1)) {
      return ("isosceles");
    }
    else {
      return ("scalene");
    }
  }

  public String toString() {
    String str = ("v1(" + String.valueOf(v1.getX()) + ", " + String.valueOf(v1.getY()) + ") v2(" + String.valueOf(v2.getX()) + ", " + String.valueOf(v2.getY()) + ") v3(" + String.valueOf(v3.getX()));
    str = str + ", " + String.valueOf(v3.getY()) + ")";
    return (str);
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = newP;
    }
    if (index == 1) {
      v2 = newP;
    }
    if (index == 2) {
      v3 = newP;
    }
  }

}
