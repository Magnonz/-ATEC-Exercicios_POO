package Exercicios1;
import Exercicios2.*;
import Exercicios3.*;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("-----------------Escolha um opção----------------- ");
		System.out.println("1-Calculadora de Gastos");
		System.out.println("2-Media de Golos ");
		System.out.println("3-Compras");
		System.out.println("0-Sair");
		
		Scanner reader = new Scanner(System.in);
		int op=reader.nextInt();
		
		switch(op){
		case 1 : new MediaDespesas();break; 
		case 2 : new Jogo();break;
		case 3 : new CriarArtigo();break;
		case 0 : System.out.println("Adeus!!");break;
		default: System.out.println("Valor invalido");break;
		
		
		
		
		
		
		}

	}

}
