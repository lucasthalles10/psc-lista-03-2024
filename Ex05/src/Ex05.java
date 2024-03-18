/* UC: PSC     Data: 12/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java                    RA:42413970*/
import java.util.Scanner;
public class Ex05 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    double n1 = sc.nextDouble();

    System.out.print("Digite o segundo número: ");
    double n2 = sc.nextDouble();

    System.out.print("Digite o símbolo da operação (+, -, *, / ou ^): ");
    char op = sc.next().charAt(0);

    double resultado = 0;

    switch (op) {
        case '+':
            resultado = n1 + n2;
            break;
        case '-':
            resultado = n1 - n2;
            break;
        case '*':
            resultado = n1 * n2;
            break;
        case '/':
            resultado = n1 / n2;
            break;
        case '^':
            resultado = Math.pow(n1, n2);
            break;
        default:
            System.out.println("Erro: Símbolo da operação inválido.");
            System.exit(0); // Encerra o programa caso o símbolo seja inválido
    }

    System.out.println("Resultado da operação: " + resultado);

    sc.close();
}
}