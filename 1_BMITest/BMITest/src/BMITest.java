import java.util.Scanner;

public class BMITest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double bmi, weight, height;
        String interpretation;

        System.out.println("Welcome to BMI Test!");

        weight = takeWeight();

        height = takeHeight();

        bmi = calcBMI(weight, height);

        interpretation = getBMIInterpretation(bmi);

        System.out.printf("%-4s%s is %s", "BMI", "Interpretation", interpretation);
    }

    private static String getBMIInterpretation(double bmi) {
        if(bmi < 18.5) return "Underweight";

        if(bmi < 25.0) return "Normal";

        if(bmi < 30) return "Overweight";

        return "Obese";
    }

    private static double calcBMI(double weight, double height) {
        return weight/(height * height);
    }

    private static double takeHeight() {
        System.out.printf("Height:");

        return scanner.nextFloat();
    }

    private static double takeWeight() {
        System.out.printf("Weight:");

        return scanner.nextFloat();
    }
}
