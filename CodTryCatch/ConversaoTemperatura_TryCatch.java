import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversaoTemperatura_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       try {
       System.out.print("Digite a temperatura em Celsius: ");
       double celsius = sc.nextDouble();

       if (celsius < -273.15) {
        throw new TemperaturaInvalidaException("Temperatura abaixo do zero absoluto.");
         }

        double fahrenheit = celsiusParaFahrenheit(celsius);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

             } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Digite um valor numérico.");
              } catch (TemperaturaInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());

                    sc.close();
                }
            }
            public static double celsiusParaFahrenheit(double celsius) {
                return (celsius * 9 / 5) + 32;
            }
        }

        class TemperaturaInvalidaException extends Exception {
            public TemperaturaInvalidaException(String mensagem) {
                super(mensagem);
            }
        }
