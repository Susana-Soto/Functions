
import java.util.Scanner;

	public class Calculadora {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Calculadora Básica");
	        System.out.println("Ingrese dos números:");
	        System.out.print("Número 1: ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Número 2: ");
	        double num2 = scanner.nextDouble();

	        // Definimos las operaciones en un arreglo de Strings
	        String[] operaciones = {"suma", "resta", "multiplicación", "división"};

	        // Realizamos las operaciones y mostramos los resultados
	        for (String operacion : operaciones) {
	            double resultado = calcularResultado(operacion, num1, num2);
	            System.out.println("El resultado de la " + operacion + " es: " + resultado);
	        }
	    }

	    // para calcular el resultado de la operación
	    public static double calcularResultado(String operacion, double num1, double num2) {
	        double resultado = 0;
	        switch (operacion) {
	            case "suma":
	                resultado = num1 + num2;
	                break;
	            case "resta":
	                resultado = num1 - num2;
	                break;
	            case "multiplicación":
	                resultado = num1 * num2;
	                break;
	            case "división":
	                resultado = num1 / num2;
	                break;
	            default:
	                System.out.println("Operación inválida.");
	        }
	        return resultado;
	    }
	}