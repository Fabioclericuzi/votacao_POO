package application;

import java.util.Scanner;

import entities.Urna;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Boolean votacaoRolando = true;
		Urna urna;
		int numeroCandidatos;
		int numeroCandidato;
		
		urna = new Urna();
		
		urna.iniciarUrna();
		numeroCandidatos = sc.nextInt();
		urna.numeroCandidatos(numeroCandidatos);
		
		for(int i = 0; i < numeroCandidatos; i += 1) {
			String nomeCandidato;
			
			System.out.println("Informe o nome do candidato nº" + (i+1) + ": ");
			nomeCandidato = sc.next();
			
			System.out.println("Informe o número do candidato " + nomeCandidato + ": ");
			numeroCandidato = sc.nextInt();
			
			urna.incluirCandidato(i, numeroCandidato + " - " + nomeCandidato);
			
			if (i == numeroCandidatos-1) {
				System.out.println("\n[****** Candidatos Cadastrados: ******]\n");
				urna.imprimirCandidatos();	
			}
		}
		
		while (votacaoRolando) {
			int voto;
			
			urna.mostrarCandidatos();
			voto = sc.nextInt();
			
			
			if (voto == 0) {
				votacaoRolando = false;
			} else {
				urna.computarVoto(voto);
			}
		}
		
		urna.resultadoEleicao();
	}
}