package alb_TA08_02;

public class Password {
	private int longitud;
	private String contra;

	public Password() {
		this.longitud = 8;
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contra = "";
		for (int i = 0; i < longitud; i++) {
			this.contra = this.contra + (int)( Math.random() * 10);
		}
	}
}
