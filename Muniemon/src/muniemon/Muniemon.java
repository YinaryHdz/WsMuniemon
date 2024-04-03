package muniemon;

public class Muniemon {
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private TipoMuniemon tipoMuniemon;    
	private int velocidad;
	
	
	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", tipoMuniemon=" + tipoMuniemon + ", velocidsad=" + velocidad + "]";
	}

	public Muniemon(String nombre, int vida, int ataque, int defensa, TipoMuniemon tipoMuniemon, int velocidad) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tipoMuniemon = tipoMuniemon;
		this.velocidad = velocidad;
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
		if(vida < 0) {
			this.vida = 0;
		}else {
			this.vida = vida;		
		}
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
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public double obtenerMultiplicador(TipoMuniemon tipoAtacado) {
	    switch(tipoMuniemon) {
	        case PLANTA:
	            if (tipoAtacado == TipoMuniemon.AGUA) {
	                return 1.5;
	            } else if (tipoAtacado == TipoMuniemon.FUEGO) {
	                return 0.5;
	            } else {
	                return 1.0;
	            }
	        case FUEGO:
	            if (tipoAtacado == TipoMuniemon.PLANTA) {
	                return 1.5;
	            } else if (tipoAtacado == TipoMuniemon.AGUA) {
	                return 0.5;
	            } else {
	                return 1.0;
	            }
	        case AGUA:
	            if (tipoAtacado == TipoMuniemon.FUEGO) {
	                return 1.5;
	            } else if (tipoAtacado == TipoMuniemon.PLANTA) {
	                return 0.5;
	            } else {
	                return 1.0;
	            }
	        default:
	            return 1.0;
	    }
	}
	public void atacar (Muniemon muniemon) {
		System.out.println( this.getNombre() + " ataca a: " +muniemon.nombre); 
		if (muniemon.vida>0){
			double multiplicador = obtenerMultiplicador(getTipoMuniemon());
			int vidaFinal = 0;
			int danio = (int)(this.getAtaque() * multiplicador)- muniemon.defensa;
			if(danio >0) {
				System.out.println("Han atacado a " +muniemon.nombre + ", el danio es de: "+danio);
				vidaFinal = muniemon.vida - danio;
				muniemon.vida = vidaFinal;
				if(muniemon.vida < 0) {
					System.out.println(muniemon.nombre + " Ha sido derrotado");
					
				}else {
					System.out.println("La vida de " + muniemon.nombre + " es de: " + muniemon.vida);
				}	
			}	
		}else {
			System.out.println("No se puede atacar porque "+muniemon.nombre + " esta muerto");
		}
	}
}
