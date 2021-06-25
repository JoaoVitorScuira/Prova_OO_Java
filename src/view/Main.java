//Alunos: João Vitor Gasparotto Scuira     e	  Luiz Henrique Stocco


package view;

import java.util.Scanner;

import controller.FormaController;
import models.Circulo;
import models.Retangulo;
import models.Triangulo;

public class Main {

	public static void main(String[] args) {

		Scanner menu = new Scanner(System.in);
		int opcao = 0;
		
		FormaController controller = new FormaController();

		while (opcao != 8) {

			System.out.print("##--       Menu           --##|\n\n");
			System.out.print("|-----------------------------|\n");
			System.out.print("| Opc 1 - Cadastrar retangulo |\n");
			System.out.print("| Opc 2 - Cadastrar Triângulo |\n");
			System.out.print("| Opc 3 - Cadastrar Circulo   |\n");
			System.out.print("| Opc 4 - Listar todos        |\n");
			System.out.print("| Opc 5 - Listar Retângulo    |\n");
			System.out.print("| Opc 6 - Listar Triângulo    |\n");
			System.out.print("| Opc 7 - Listar Circulo      |\n");
			System.out.print("| Opc 8 - Sair                |\n");
			System.out.print("|-----------------------------|\n");
			System.out.print("Digite uma opção: ");

			try {
				opcao = menu.nextInt();
		    } catch (Exception e) {
		    	System.out.println("Dado digitado não é compativel");
		    	return;
		    }
			
			switch (opcao) {

			case 1:
				Retangulo r = new Retangulo();
				try {
				
				System.out.println("Digite a altura: ");
				r.setAltura(menu.nextInt());
				System.out.println("Digite a largura: ");
				r.setLargura(menu.nextInt());
				controller.Cadastrar(r);
				} catch (Exception e) {
			    	System.out.println("Dado digitado não é compativel");
			    }
				break;
			case 2:
				try {
				Triangulo t = new Triangulo();
				System.out.println("Digite a altura: ");
				t.setAltura(menu.nextInt());
				System.out.println("Digite a base: ");
				t.setBase(menu.nextInt());
				controller.Cadastrar(t);
				}catch (Exception e) {
			    	System.out.println("Dado digitado não é compativel");
			    }
				break;
			case 3:
				try {
				Circulo c = new Circulo();
				System.out.println("Digite o raio: ");
				c.setRaio(menu.nextInt());
				controller.Cadastrar(c);
				}catch (Exception e) {
			    	System.out.println("Dado digitado não é compativel");
			    }
				break;
			case 4:
				controller.listar();
				break;
			case 5:
				controller.listarRetangulos();
				break;
			case 6:
				controller.listarTriangulo();
				break;
			case 7:
				controller.listarCirculos();
				break;
			case 8:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opcao errada");
				break;

			}
		}
	}
}
