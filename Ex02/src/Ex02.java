/* UC: PSC     Data: 12/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java                   RA: 42413970
*/
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Maquina de salgadinhos, doces,sucos e refigerentes!");
        System.out.println("A maquina so aceita notas de 50,20,10,5,2 e 1");
        System.out.println("Informe o valor da compra!");
        int vac = sc.nextInt();
        System.out.println("Informe o valor pago! ");
        int vap = sc.nextInt();
        int[] notas ={50,20,10,5,2,1};
        
        if (vac > vap){
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
        }
        else{   // quantidade minima de notas de troco
            int troco = vap - vac;
            System.out.println("Troco: R$" + troco);
            System.out.println("Notas do troco:");
            for (int i = 0; i < notas.length; i++) 
            {
                int qn = troco / notas[i];
                if (qn> 0) 
                {
                    System.out.println(qn + " nota(s) de R$" + notas[i]);
                    troco %= notas[i];
                }          
            }    
        } 
        sc.close(); //fechando o scanner       
    }      
} 

/*Anotações:
Variaveis utilizadas: 
inteira: vac,vap,troco,
Metodos utilizados: lengh
*/