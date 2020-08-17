public class Program {
    public static void main(String[] args) {
        QuadraticEquation quadratic = new QuadraticEquation(1,2,1);

        double delta = quadratic.getDiscriminant();

        if(delta < 0) {
            System.out.printf("This quadratic equation hasn't any route");
        }

        if(delta == 0) {
            System.out.printf("This quadratic equation has 2 same routes: %.2f", quadratic.getRoute1());
        }

        if (delta > 0) {
            System.out.printf("This quadratic equatin has 2 routes: %.2f and %.2f", quadratic.getRoute1(), quadratic.getRoute2());
        }
    }


}
