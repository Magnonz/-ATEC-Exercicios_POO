package Exercicios3;

public class Artigo {

	
	//-----------------Atributos---------------
	public double preco;
	public String newAttr;
	
		
	
	
	//---------------Construtor----------------
	public Artigo(double preco,String newAttr ) {
		
		this.preco=preco;
		this.newAttr=newAttr;
		
		
		
	}

	
	//-----------Metodos--------------------------

	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getNewAttr() {
		return newAttr;
	}


	public void setNewAttr(String newAttr) {
		this.newAttr = newAttr;
	}

}
