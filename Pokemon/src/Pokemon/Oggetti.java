package Pokemon;

import java.io.Serializable;

public class Oggetti implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String Pozione;
	
	public Oggetti() {
		super();
	}
	
	public Oggetti (Oggetti p) {
		super();
		this.Pozione = p.Pozione;
	}

	public String getPozione() {
		return Pozione;
	}

	public void setPozione(String pozione) {
		Pozione = pozione;
	}
	
	
}
