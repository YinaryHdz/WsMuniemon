package muniemon;

import java.util.Scanner;

public class Combate {
	private static Scanner sc;
	private Muniemon primerMuniemon;
	private Muniemon segundoMuniemon;
	public Combate(Muniemon primerMuniemon, Muniemon segundoMuniemon) {
		super();
		this.primerMuniemon = primerMuniemon;
		this.segundoMuniemon = segundoMuniemon;
	}
	
	public Muniemon empezarCombate () {
		sc = new Scanner (System.in);
		int turno = 1;
		Muniemon primerAtacante = null;
		Muniemon segundoAtacante = null;
		if (this.primerMuniemon.getVelocidad() > this.segundoMuniemon.getVelocidad()) {
			primerAtacante = primerMuniemon;
			segundoAtacante = segundoMuniemon;
		}else {
			primerAtacante = segundoMuniemon;
			segundoAtacante = primerMuniemon;
		}
		while (primerAtacante.getVida() > 0 && segundoAtacante.getVida() > 0) {
			
			System.out.println("Numero de turno: " + turno++);
			System.out.println("Pulse enter para continuar con el combate");
			sc.nextLine();
			sc.nextLine();

			if (primerAtacante.getVida() <= 0 || segundoAtacante.getVida() <= 0) {
				break;	
			} 
			primerAtacante.atacar(segundoAtacante);
			if (primerAtacante.getVida() <= 0 || segundoAtacante.getVida() <= 0) {
				break;	
			}
			segundoAtacante.atacar(primerAtacante);

		}
		if (primerAtacante.getVida()> 0){
			System.out.println("El ganador ha sido " +primerAtacante.getNombre());
			return primerAtacante;
		}else{
			System.out.println("El ganador ha sido " +segundoAtacante.getNombre());
			return segundoAtacante;
		}
		
	}

}
