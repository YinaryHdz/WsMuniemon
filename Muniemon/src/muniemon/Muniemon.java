package muniemon;

public class Muniemon {
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private TipoMuniemon tipoMuniemon;
	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", tipoMuniemon=" + tipoMuniemon + "]";
	}
	
	public Muniemon(String nombre, int vida, int ataque, int defensa, TipoMuniemon tipoMuniemon) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tipoMuniemon = tipoMuniemon;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public TipoMuniemon getTipoMuniemon() {
		return tipoMuniemon;
	}
	public void setTipoMuniemon(TipoMuniemon tipoMuniemon) {
		this.tipoMuniemon = tipoMuniemon;
	}
	
}
