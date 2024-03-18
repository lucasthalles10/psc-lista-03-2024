/* UC: PSC     Data: 12/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java                   RA: 42413970
*/
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Máquina de salgadinhos, doces, sucos e refrigerantes!");
        System.out.println("A máquina só aceita notas de R$ 50, R$ 20, R$ 10, R$ 5, R$ 2 e R$ 1");
        System.out.print("Informe o valor da compra: ");
        int vc = sc.nextInt();
        System.out.print("Informe o valor pago: ");
        int vp = sc.nextInt();
        int troco = vp - vc;
        if (troco < 0) {// valida se o valor é suficiente para compra 
            System.out.println("O valor pago é insuficiente.");
        } else {
            System.out.println("Troco: R$" + troco);
            System.out.println("Quantidade de notas do troco:");
            int qt50 = troco / 50; //quantidade de notas  
            troco %= 50;
            int qt20 = troco / 20;
            troco %= 20;
            int qt10 = troco / 10;
            troco %= 10;
            int qt5 = troco / 5;
            troco %= 5;
            int qt2 = troco / 2;
            troco %= 2;
            int qt = troco;
            
            if (qt50 > 0) System.out.println(qt50 + " nota(s) de R$50");
            if (qt20 > 0) System.out.println(qt20 + " nota(s) de R$20");
            if (qt10 > 0) System.out.println(qt10 + " nota(s) de R$10");
            if (qt5 > 0) System.out.println(qt5 + " nota(s) de R$5");
            if (qt2 > 0) System.out.println(qt2 + " nota(s) de R$2");
            if (qt > 0) System.out.println(qt + " nota(s) de R$1");
        }

        sc.close();
    }
}