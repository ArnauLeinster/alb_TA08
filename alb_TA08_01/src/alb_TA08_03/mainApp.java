package alb_TA08_03;

import alb_TA08_03.Electrodomestico.Color;
import alb_TA08_03.Electrodomestico.Letra;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico e1 = new Electrodomestico(2, Color.azul, Letra.A, 3);
		Electrodomestico e2 = new Electrodomestico();
		Electrodomestico e3 = new Electrodomestico(30, 40);

		System.out.println(e1.getColor());
		System.out.println(e1.getPrecio());
		System.out.println(e1.getPeso());
		System.out.println(e1.getConsumo());

		System.out.println();

		System.out.println(e1.getColor());
		System.out.println(e2.getPrecio());
		System.out.println(e2.getPeso());
		System.out.println(e2.getConsumo());

		System.out.println();

		System.out.println(e3.getColor());
		System.out.println(e3.getPrecio());
		System.out.println(e3.getPeso());
		System.out.println(e3.getConsumo());
	}

}
