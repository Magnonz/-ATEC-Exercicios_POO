package Exercicios3;

import java.util.Scanner;

public class CriarArtigo {

	Artigo artigo1=new Artigo(0,"");
	Artigo artigo2=new Artigo(0,""); 
	Artigo artigo3=new Artigo(0,"");
	
	
	public CriarArtigo() {
		Scanner reader = new Scanner(System.in);

		String nome;
		double preco;
		
		
		
		for(int i=0;i<3;i++){
			
			System.out.print("Introduza o nome do "+(i+1)+"º artigo:");
			nome=reader.next();
			System.out.print("Introduza o preço do "+(i+1)+"º artigo:");
			preco=reader.nextDouble();
			if(i==0)
			alterarArtigo(artigo1,preco,nome);
			else if(i==1)
			alterarArtigo(artigo2,preco,nome);
			else if(i==2)
			alterarArtigo(artigo3,preco,nome);
			
		}
		
		
		calcularGastos(artigo1,artigo2,artigo3);
		
		
		
		
	}
	
	public void calcularGastos(Artigo art1,Artigo art2,Artigo art3){
		double soma=0;
		soma=art1.getPreco()+art2.getPreco()+art3.getPreco();
		System.out.println("O valor total é : "+ soma );
		
		
	}
	
	public void alterarArtigo(Artigo art,double preco, String nome){
		
		art.setNewAttr(nome);
		art.setPreco(preco);
		
		
	}

}
