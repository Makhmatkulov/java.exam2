public class MathFunctions {
    double e=2.71828182846;
    double pi=3.14159265359;
    public void circleFace(int rad) {
        System.out.println("Aylana yuzi " + (pi * (rad * rad)) + " ga teng");
    }
    public void eUpgrade(int x) {
        System.out.println("e ning " + x + "-chi darajasi " + (Math.pow(e, x)) + " ga teng");
    }
    public void triangleSurface(int a, int b, int c) {
        int s = (a + b + c) / 2;
        System.out.println("Uchburchak yuzi " + (Math.sqrt(s * (s - a) - (s - b) - (s - c))) + " ga teng");
    }
}
