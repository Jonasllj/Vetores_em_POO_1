package Programa;

import java.util.Scanner;
import java.util.Vector;

import Entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		//incialização do produto e organizando no produto
		for(int i=0; i<vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		
		double soma = 0;
		for(int i=0; i<n; i++) {
			soma = soma + vetor[i].getPreco();
		}
		double media = soma/n;
		
		System.out.printf("Média é: %.2f", media);
		
		
	}

}
