package com.dio.Calculadora;

import java.util.Scanner;

final class Calculadora {
	public static void main(String[] args) {
	try (Scanner scan = new Scanner(System.in)) {
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b =scan.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a,b);
		
		System.out.println("soma = " + soma);
		System.out.println("subtracao = " + subtracao);
		System.out.println("multiplicacao = " + multiplicacao);
		System.out.println("divisao = " + divisao);
	}
}

	public static int soma(int a, int b) {
		return a + b;
	}/* int a e b (recebe) - retorna a+b */
	public static int subtracao(int a, int b) {
		return a - b;
	}/* int a e b (recebe) - retorna a-b */
	
	public static int divisao(int a, int b) {
		return a/b;
	}/* int a e b (recebe) - retorna a / b */
	public static int multiplicacao(int a, int b) {
		return a * b;
	}/* int a e b (recebe) - retorna a*b */
	
}
