package controller;

import java.util.ArrayList;
import models.Circulo;
import models.Forma;
import models.Retangulo;
import models.Triangulo;

public class FormaController {

	ArrayList<Forma> formas = new ArrayList<Forma>();

	public void Cadastrar(Forma forma) {
		formas.add(forma);
	}

	public void listar() {
		for (Forma var : formas) {
			System.out.println(var.toString());
		}

	}

	public void listarRetangulos() {
		for (Forma var : formas) {
			if(var instanceof Retangulo)
			System.out.println(var.toString());
		}
	}

	public void listarCirculos() {
		for (Forma var : formas) {
			if(var instanceof Circulo)
			System.out.println(var.toString());
		}
	}

	public void listarTriangulo() {
		for (Forma var : formas) {
			if(var instanceof Triangulo)
			System.out.println(var.toString());
		}
	}
}
