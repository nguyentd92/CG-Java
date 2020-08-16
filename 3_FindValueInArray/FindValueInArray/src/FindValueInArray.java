import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] students = initStudents();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String inputName = scanner.nextLine();

        int index = findStudentInArray(inputName, students);

        if (index >= 0) {
            System.out.println("Position of the students in the list " + inputName + " is: " + (index + 1));
        } else {
            System.out.println("Not found " + inputName + " in the list.");
        }
    }

    private static int findStudentInArray(String inputName, String[] students) {
        int lastElementIndex = students.length - 1;

        for (int i = 0; i <= lastElementIndex; i++) {
            if (students[i].equals(inputName)) {
                return i;
            }
        }

        return -1;
    }

    private static String[] initStudents() {
        return new String[]{"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
    }
}
