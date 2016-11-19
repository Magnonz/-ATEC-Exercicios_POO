package Exercicios1;

import java.util.Scanner;

public class MediaDespesas {

	public MediaDespesas(){
	Scanner reader = new Scanner(System.in);
	
	Despesas despesas[] = new Despesas[12];
	int agua,luz,gas,telecomunicacoes;
	int medagua = 0,medluz = 0,medgas = 0 ,medtel = 0;
	
	for(int i=0;i<12;i++){
		
		System.out.println((i+1)+"º Mes");
		System.out.print("Intruduza a despesa do Agua :");
		agua=reader.nextInt();
		System.out.print("Intruduza a despesa da Luz :");
		luz=reader.nextInt();
		System.out.print("Intruduza a despesa do Gas :");
		gas=reader.nextInt();
		System.out.print("Intruduza a despesa das Telecomunicações :");
		telecomunicacoes=reader.nextInt();
		
		despesas[i]=new Despesas(agua,luz,gas,telecomunicacoes);
							
		
	}
	
	for(int y=0;y<12;y++){
		
		medagua+=despesas[y].getAgua();
		medluz+=despesas[y].getLuz();
		medgas+=despesas[y].getGas();
		medtel+=despesas[y].getTelecomunicacoes();
		
		
	}
	
	System.out.println("A media anual que gasta de Agua é : "+(medagua/12) );
	System.out.println("A media anual que gasta de Luz é : "+(medluz/12) );
	System.out.println("A media anual que gasta de Gas é : "+(medgas/12) );
	System.out.println("A media anual que gasta de Telecomunicações é : "+(medtel/12) );
	
	
	
	
	
	}
	
}
