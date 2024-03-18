/* UC: PSC     Data: 12/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java                    RA:42413970*/
import java.util.Random;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int n2 = sc.nextInt();
        int menor;
        int maior;
        if (n1 < n2) {
            menor = n1;
            maior = n2;
        } 
        else {
            menor = n2;
            maior = n1;
        }
        Random r = new Random();
        int ns= r.nextInt(maior - menor + 1) + menor; // faz gerar um numero aleatroro entre eles 
        System.out.println("Número sorteado: " + ns);
        System.out.print("O número sorteado é ");
        if (ns % 2 == 0) {// VERIFICAÇÃO DE PAR E IMPAR
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }
        sc.close();     
    }
}