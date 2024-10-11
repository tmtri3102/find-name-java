import java.util.Scanner;

public class StudentIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student's name: ");
        String name = input.nextLine();
        String[] array = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)) {
                System.out.println(name + " is on the list at index " + i + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(name + " is not on the list.");
        }

    }
}
