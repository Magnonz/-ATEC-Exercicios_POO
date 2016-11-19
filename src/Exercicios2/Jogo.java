package Exercicios2;

import java.util.Scanner;

public class Jogo {

	public Jogo() {
		
		Scanner reader = new Scanner(System.in);
		Equipa equipas[]= new Equipa[4];
		int totalgolos=0,golos;
		
		
		for(int i=0;i<4;i++){
			System.out.print("Insira o nome da "+(i+1)+"º equipa :");
			equipas[i]=new Equipa(reader.nextLine(),0);
						
			
		}
		for(int i=0;i<4;i++){
			System.out.println("Equipa "+equipas[i].getNome());
			
			for(int x=0;x<4;x++){				
				
				if(i!=x){
					System.out.println("Golos marcados contra "+equipas[x].getNome());
					totalgolos+=reader.nextInt();
					
				}
				
				
				
			}
			equipas[i].setGolos(totalgolos);
			totalgolos=0;
		}	
		for(int i =0;i<4;i++){
			
			System.out.println("A media de golos da equipa "+equipas[i].getNome()+" foi : "+(equipas[i].getGolos()/3));
			
		}
		
		
		
	}

}
