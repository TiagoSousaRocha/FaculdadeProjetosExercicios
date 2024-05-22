import java.util.Scanner;
public class CalculoMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("digite a nota 1 :");
        double nota1 = teclado.nextDouble();

        System.out.print("digite a nota 2 :");
        double nota2 = teclado.nextDouble();

        System.out.print("digite a nota 3 :");
        double nota3 = teclado.nextDouble();

        System.out.print("digite a nota 4 :");
        double nota4 = teclado.nextDouble();
        //calcilar a média das quatro notas usando o método calcularMedia
        double media = calcularMedia(nota1, nota2, nota3, nota4);
        System.out.printf("A média é :%.2f\n", media);
        teclado.close();
    }
        // Método que calcula a média de quatro notas
        private static double calcularMedia(double nota1,double nota2,double nota3,double nota4){
            return (nota1 + nota2 + nota3 + nota4) / 4;
        }


    }

