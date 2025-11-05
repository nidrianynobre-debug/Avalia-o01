
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double celsius, fahrenheit, kelvin;

        // Pede a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        celsius = entrada.nextDouble();

        // Faz as conversões
        fahrenheit = (celsius * 9 / 5) + 32;
        kelvin = celsius + 273.15;

        // Mostra os resultados
        System.out.println("\n--- Conversão de Temperatura ---");
        System.out.println("Temperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        entrada.close();
    }
}