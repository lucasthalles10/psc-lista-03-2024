/* UC: PSC     Data: 12/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java                    RA:42413970*/
import java.util.Scanner;
public class Ex04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código da operação (1 para perímetro do círculo, 2 para área do círculo, 3 para volume da esfera):");
        int co = sc.nextInt();
        double raio;
        if (co == 1 || co == 2 || co == 3) { // verificação do codigo de operação
            System.out.print("Digite o raio do círculo ou da esfera: ");
            raio = sc.nextDouble();
            // calculos 
            if (co == 1) {
                double perimetro = 2 * Math.PI * raio;
                System.out.println("Perímetro do círculo: " + perimetro);
            } else if (co == 2) {
                double area = Math.PI * raio * raio;
                System.out.println("Área do círculo: " + area);
            } else {
                double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
                System.out.println("Volume da esfera: " + volume);
            }
        } else {
            System.out.println("Código de operação inválido.");
        }

        sc.close();
    }
}