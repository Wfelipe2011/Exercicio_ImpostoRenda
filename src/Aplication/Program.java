package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImpostoFisica;
import entities.ImpostoJuridico;
import entities.Individuo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Individuo> list = new ArrayList<>();
		
		System.out.print("Entre com numero de contribuinte: ");
		int n = sc.nextInt();
		
		for (int i=1; i <=n; i++) {
			System.out.println("Dados "+ i +"° contribuinte:");
			System.out.print("Pessoa Fisica ou Juridica (f/j): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Receita Anual: ");
			double receita = sc.nextDouble();
			if (ch == 'f') {
				System.out.print("Gastos com saúde: ");
				double saude = sc.nextDouble();
				list.add(new ImpostoFisica(name, receita, saude));
			}
			else {
				if (ch == 'j') {
					System.out.print("Numero de Funcionarios: ");
					int func = sc.nextInt();
					list.add(new ImpostoJuridico(name, receita, func));
				}
			}
		}// Final for;
		System.out.println();
		System.out.println("Impostos pagos: ");
		double soma = 0; 
		for (Individuo ind : list) {
			System.out.println(ind.getName()+ ": R$ " + String.format("%.2f", ind.impostoAnual()));
		}
		for (Individuo ind : list) {
		soma += ind.impostoAnual();	
		}
		System.out.println();
		System.out.printf("Total Impostos arrecadado: R$ %.2f", soma);
		sc.close();
	}
}