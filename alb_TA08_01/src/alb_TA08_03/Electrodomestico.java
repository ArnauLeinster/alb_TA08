package alb_TA08_03;

public class Electrodomestico {
	private double precio = 100;
	private Color color = Color.blanco;
	private Letra consumo = Letra.f;
	private double peso = 5;

	public Electrodomestico() {
		super();

	}

	public Electrodomestico(double precio, double peso) {
		super();
		this.precio = precio;
		this.peso = peso;
	}

	public Electrodomestico(double precio, Color color, Letra consumo, double peso) {
		super();
		this.precio = precio;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	protected enum Color {
		blanco, negro, azul, rojo, gris
	}

	protected enum Letra {
		A, B, C, D, E, F, a, b, c, d, e, f
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Letra getConsumo() {
		return consumo;
	}

	public void setConsumo(Letra consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
