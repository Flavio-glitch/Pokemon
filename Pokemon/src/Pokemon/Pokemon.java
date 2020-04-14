package Pokemon;

import java.io.Serializable;

public class Pokemon implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String tipo;
	private String nome;
	private int PV;
	Mosse m1= new Mosse();
	Mosse m2= new Mosse();
	Mosse m3= new Mosse();
	Mosse m4= new Mosse();
	
	public Pokemon() {
		super();
	}
	
	public Pokemon(Pokemon p) {
		super();
		this.tipo = p.tipo;
		this.nome = p.nome;
		this.PV = p.PV;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPV() {
		return PV;
	}
	public void setPV(int pV) {
		PV = pV;
	}
}
