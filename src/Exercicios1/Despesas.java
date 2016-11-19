package Exercicios1;

public class Despesas {
	
	//----------Atributos----------
	public Integer agua;
	public Integer luz;
	public Integer gas;
	public Integer telecomunicacoes;
	
	
	//------------Construtor------------------
	public Despesas(Integer agua,Integer luz,Integer gas ,Integer telecomunicacoes){
		
		this.agua=agua;
		this.luz=luz;
		this.gas=gas;
		this.telecomunicacoes=telecomunicacoes;		
		
	}	
	
	
	
	
	//------------Metodos---------------
	public Integer getAgua() {
		return agua;
	}
	public void setAgua(int agua) {
		this.agua = agua;
	}
	public Integer getLuz() {
		return luz;
	}
	public void setLuz(int luz) {
		this.luz = luz;
	}
	public Integer getGas() {
		return gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}
	public Integer getTelecomunicacoes() {
		return telecomunicacoes;
	}
	public void setTelecomunicacoes(int telecomunicacoes) {
		this.telecomunicacoes = telecomunicacoes;
	}
	
	
	
	
	
	
	
	
}
