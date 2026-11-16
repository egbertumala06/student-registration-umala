
package studentregistration;

import java.util.*;
public class StudentRegistration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> ids = new HashSet<>();
        HashMap<Integer, String> students = new HashMap<>();
        System.out.println("=== STUDENT REGISTRATION SYSTEM ===");
        for (int i = 1; i <= 5; i++) {
            System.out.print("\nEnter Student ID: ");
            int id = input.nextInt();
            if (ids.contains(id)) {
                System.out.println("Duplicate ID! Please try again.");
                i--;
                continue;
            }
            ids.add(id);
            input.nextLine();
            System.out.print("Enter Student Name: ");
            String name = input.nextLine();
            students.put(id, name);
            System.out.println("Student registered successfully!");
        }
        System.out.println("\nTotal Unique Students: " + ids.size());
        TreeMap<Integer, String> sortedStudents =
                new TreeMap<>(students);
        System.out.println("\n=== REGISTERED STUDENTS ===");
        for (Integer id : sortedStudents.keySet()) {
            System.out.println("ID: " + id +
                    " | Name: " + sortedStudents.get(id));
        }
        input.close();
    }
}
