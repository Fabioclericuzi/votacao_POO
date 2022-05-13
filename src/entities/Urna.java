package entities;


public class Urna {
	
	private String[] candidatos;
	private int[] votosCandidatos;
	int totalVotos = 0;
	
	
	public void iniciarUrna() {
		System.out.println("\n[****** Inicializando a Urna ******]\n");
		System.out.println("Quantos candidatos vão participar da eleição?");
	}
	
	public void numeroCandidatos(int numeroCandidatos) {
		candidatos = new String[numeroCandidatos];
		votosCandidatos = new int[numeroCandidatos];
		for(int i = 0; i < votosCandidatos.length; i+=1) {
			votosCandidatos[i] = 0;
		}
	}
	
	public void incluirCandidato(int posicao, String nomeCandidato) {
		candidatos[posicao] = nomeCandidato;
	}
	
	public void imprimirCandidatos() {
		for(int i = 0; i < candidatos.length; i+=1) {
			System.out.println(candidatos[i]);
		}
	}	
	
	public void iniciarEleicao() {
		System.out.println("\n[****** Eleições Iniciadas ******]\n");
		
	}
	
	public void mostrarCandidatos() {
		System.out.println("\n[****** Escolha seu Candidato ******]\n");
		for(int i = 0; i < candidatos.length; i+=1) {
			System.out.println(candidatos[i]);
		}
	}
	
	public void computarVoto(int voto) {
		for (int i = 0; i < candidatos.length; i+=1) {
			if(voto == Integer.parseInt(candidatos[i].substring(0,2))) {
				votosCandidatos[i] += 1;
				totalVotos += 1;
			}
		}
	}
	
	public void resultadoEleicao() {
		System.out.println("\n[***************** Resultado da Eleição *****************]");
		for(int i = 0; i < candidatos.length; i+=1) {
			System.out.print(candidatos[i].substring(5) + " (" + candidatos[i].substring(0,2) + ") - ");
			System.out.println("Total de votos: " + votosCandidatos[i] + " | " + votosCandidatos[i]*100/totalVotos + "%");
		}
	}
}
