package joaovictor.br.projetos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        double valor1 = 0;
        double valor2 = 0;
        char opcao;
        System.out.println("Calculadora Simples");
        System.out.println("Escolha um número:");
        valor1 = sc.nextDouble();
        while (true) {
            System.out.println("Deseja fazer uma soma(+), subtração(-), multiplicação(*) ou divisão(/)?");
            if(x == 0){
                x +=1;
            }else{
                System.out.println("Se desejar parar digite 'n'");
            }
            opcao = sc.next().charAt(0);
            switch (opcao) {
                case '+':
                    System.out.println(valor1 + " somado por:");
                    valor2 = sc.nextDouble();
                    valor1 += valor2;
                    System.out.println(valor1);
                    break;
                case '-':
                    System.out.println(valor1 + " subtraído por:");
                    valor2 = sc.nextDouble();
                    valor1 -= valor2;
                    System.out.println(valor1);
                    break;
                case '*':
                    System.out.println(valor1 + " multiplicado por:");
                    valor2 = sc.nextDouble();
                    valor1 *= valor2;
                    System.out.println(valor1);
                    break;
                case '/':
                    System.out.println(valor1 + " dividido por:");
                    valor2 = sc.nextDouble();
                    valor1 /= valor2;
                    System.out.println(valor1);
                    break;
                case 'n':
                    System.exit(0);
                default:
                    System.out.println("Caractere incorreto");
            }
        }
    }
}
