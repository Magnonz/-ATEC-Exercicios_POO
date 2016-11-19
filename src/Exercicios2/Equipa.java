package Exercicios2;

public class Equipa {
	
	//------------------Atributos--------------------
	public String nome;
	public int golos;
	
	
	
	//-----------------Construtor--------------------
	public Equipa(String nome,int golos){
		
		this.nome=nome;
		this.golos=golos;
				
		
	}	
	
	//------------------Metodos---------------------
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getGolos() {
		return golos;
	}
	public void setGolos(int golos) {
		this.golos = golos;
	}
	
	

}
