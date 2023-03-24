package alb_TA08_04;

public class Serie {
	private String titulo = "";
	private int tempo = 3;
	private boolean entregado = false;
	private String genero = "";
	private String creador = "";

	public Serie() {
		super();
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int tempo, boolean entregado, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

}
