package Pokemon;

import java.io.Serializable;

public class Mosse implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String Nome;
	private int danno;
	
	public Mosse() {
		super();
	}
	
	public Mosse (Mosse m) {
		super();
		this.Nome = m.Nome;
		this.danno = m.danno;
		
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getDanno() {
		return danno;
	}

	public void setDanno(int danno) {
		this.danno = danno;
	}
	
	
}
