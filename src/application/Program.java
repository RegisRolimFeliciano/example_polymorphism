package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List <Product> list = new ArrayList<>();
		
		System.out.println("Entre com a quantidade de produtos");
		int prod = sc.nextInt();
		for(int i =0; i<prod; i++) {
			System.out.println("Comum(c), Importado(i) ou Usado(u) ?");
			char tipo = sc.next().charAt(0);
			System.out.println("Dados do Produto #" + i);
			System.out.print("Nome: ");
			System.out.println();
			String nome = sc.next();
			System.out.print("Preço: ");
			double preco = sc.nextInt();
			if (tipo == 'i') {
				System.out.print("Taxa de Alfandega: ");
				double taxaAlfandega = sc.nextDouble();
				Product pr = new ProdutoImportado(nome, preco, taxaAlfandega);
				list.add(pr);
				
			}
			else if (tipo == 'u') {
				System.out.print("Data de fabricação (DD/MM/AAAA): ");
				Date dataFab = sdf.parse(sc.next());
				Product pr = new ProdutoUsado(nome, preco, dataFab);
				list.add(pr);
			}
			else if (tipo == 'c') {
				Product pr = new Product(nome, preco);
				list.add(pr);
			}
			
		}
		
		System.out.print("Etiqueta de Preços:");
		for (Product pr : list) {
			System.out.println(pr.etiquetaPreco());
		}
		
		sc.close();
	}

}
