import java.util.Scanner;

public class nombre {

    private static void printNameLength(String name) {
        System.out.println("Tamaño del nombre: " + name.length());
    }

    private static void printNameCharacters(String name) {
        System.out.print("Deletreo: ");
        for (char ch : name.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    private static void printFullName(String firstName, String lastName) {
        System.out.println("Nombre completo: " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre: ");
        String firstName = scanner.nextLine();

        System.out.print("Ingresa el apellido: ");
        String lastName = scanner.nextLine();

        printNameLength(firstName);
        printNameCharacters(firstName);
        printFullName(firstName, lastName);

        scanner.close();
    }
}