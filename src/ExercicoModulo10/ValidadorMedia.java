package ExercicoModulo10;

import java.util.Scanner;

/**
 * @author felipe.espinoza
 * @version 1.0
 */


public class ValidadorMedia {

    public static void main (String[] args){

        Scanner valorDigitado = new Scanner(System.in);

        System.out.println("Vamos realizar o calculo de média!");
        
        String calcularMedia = "";

        do {
            System.out.println("Digite o nome do aluno(a): ");
            String nomeAluno = valorDigitado.next();

            System.out.println("Agora iremos inserir as notas.\nDigite a nota referente a prova de Português:");
            int notaPortugues = valorDigitado.nextInt();
            System.out.println("Agora insira a nota referente a prova de Matemática:");
            int notaMatematica = valorDigitado.nextInt();
            System.out.println("Agora insira a nota referente a prova de História:");
            int notaHistoria = valorDigitado.nextInt();
            System.out.println("Agora insira a nota referente a prova de Geografia:");
            int notaGeografia = valorDigitado.nextInt();
            
            long resultadoMedia = (notaMatematica + notaGeografia + notaHistoria + notaPortugues) / 4;
            
            if (resultadoMedia >= 7 && resultadoMedia <= 10){
                System.out.println("A média é de " + resultadoMedia + ".\n O(A) aluno(a) " + nomeAluno + " esta aprovado(a)!");
            } else if (resultadoMedia >= 5 && resultadoMedia <= 6) {
                System.out.println("A média é de " + resultadoMedia + ".\n O(A) aluno(a) " + nomeAluno + " esta de recuperação!");
            } else {
                System.out.println("A média é de " + resultadoMedia + "\n O(A) aluno(a) " + nomeAluno + " esta reprovado(a)!");
            }

            System.out.print("\nGostaria de calcular a nota de outro aluno(a)?");
            calcularMedia = valorDigitado.next();
        } while(calcularMedia.equalsIgnoreCase("Sim"));
        System.out.println("Obrigado!\nNos vemos em breve!");
    }
}
