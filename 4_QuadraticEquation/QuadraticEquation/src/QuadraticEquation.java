public class QuadraticEquation {
    int a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b*b-4*a*c;
    }

    public double getRoute1() {
        return (-b + Math.sqrt(getDiscriminant())) / 2*a;
    }

    public double getRoute2() {
        return (-b - Math.sqrt(getDiscriminant())) / 2*a;
    }
}
