import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MathFunctions functions = new MathFunctions();
        functions.circleFace(5);
        functions.eUpgrade(3);
        functions.triangleSurface(5,6,7);
    }
}