package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new  Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10  || nota < 0 ) {   // tem que começar com if 
			
			System.out.println("Nota Invalida !");
			
		}else if(nota>= 8.1) {			
			System.out.println("Conceito A");
			
		}else if (nota >= 6.1) {				// e pode finalizar com else if ou else
				System.out.println("Conceito B");
			}
		
		System.out.println("Fim!");
		
		entrada.close();
			
		}

	}


