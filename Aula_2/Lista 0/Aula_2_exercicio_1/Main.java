import java.util.Scanner;
public class Main {
    
    public static void main(String arg[]){
        String aluno;
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        aluno = ler.nextLine();
        System.out.println("Programação I");
        System.out.println("-   Professor Fernando Bevilacqua");
        System.out.println("-   Aluno: " + aluno);
        System.out.println("-   Objetivo: ");
        System.out.print(" O objetivo da disciplina é compreender os conceitos fundamentais \n do paradigma de programação orientada a objetos e aplicá-los no \n desenvolvimento de soluções de software. \n");
        System.out.println("-   Turno: Noturno");
    }
}
