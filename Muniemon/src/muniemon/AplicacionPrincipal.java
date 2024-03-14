package muniemon;

import java.util.ArrayList;
import java.util.Scanner;

public class AplicacionPrincipal {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menuYSeleccion();
		
	}
	
	public static void menuYSeleccion() {
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		Muniemon muniemon = null;
		ArrayList<Muniemon> listaMuniemon = new ArrayList<Muniemon>();

		do {
			System.out.println("Seleccione la opcion que desee en el siguiente menú");
			System.out.println("==========Menu==========");
			System.out.println("1. Dar de alta Muniemon");
			System.out.println("2. Mostrar Muniemon");
			System.out.println("3. Empezar combate");
			System.out.println("4. Salir del programa");
			System.out.println("Por favor, seleccione una opcion");
			opcion= sc.nextInt();
			switch(opcion) {
			case 1:
				if (listaMuniemon.size() != 2) {
					muniemon = altaMuniemon(sc);
					listaMuniemon.add(muniemon);
				}else{
					System.out.println("Solo se permite ingresar dos muniemones");
				}
				break;
			case 2:
				for(Muniemon m : listaMuniemon) {
					mostrarMuniemon(m);
				}
				break;
			case 3:
				Combate combate = new Combate(listaMuniemon.get(0),listaMuniemon.get(1));
				combate.empezarCombate();
				break;
			case 4:
				System.out.println("Ha seleccionado la opcion de salir del programa");
				
				}
		}while (opcion != 4);
		
		
	}
	
	public static Muniemon altaMuniemon(Scanner sc) {
		
		System.out.println("Ha seleccionado la opcion de dar de alta al Muniemon.");
		sc.nextLine();
		System.out.println("Primero: Introduce el nombre del Muniemon");
		String nombre = sc.nextLine();
		System.out.println("Introduce la vida del Muniemon");
		int vida = sc.nextInt();
		System.out.println("Introduce el ataque del Muniemon");
		int ataque = sc.nextInt();
		System.out.println("Introduce la defensa del Muniemom");
		int defensa = sc.nextInt();
		System.out.println("Introduce el tipo del muniemon:");
		for(int i = 0; i < TipoMuniemon.values().length;i++) {
			System.out.println(i+ " - "+ TipoMuniemon.values()[i]);
		}
		int seleccionTipo= sc.nextInt();
		TipoMuniemon tm = TipoMuniemon.values()[seleccionTipo];
		System.out.println("Ha seleccionado: " +tm);
		System.out.println("Introduce la velocidad del Muniemom");
		int velocidad = sc.nextInt();
		
		Muniemon muniemon = new Muniemon(nombre, vida, ataque, defensa, tm, velocidad);
		System.out.println("Felicidades, ya ha creado su Muniemon");
		return muniemon;
	}
	
	
	public static void mostrarMuniemon(Muniemon muniemon) {
		if (muniemon != null) {
			System.out.println("==========Datos del muniemon==============");
			System.out.println("Nombre: "+muniemon.getNombre());
			System.out.println("Vida: "+muniemon.getVida());
			System.out.println("Ataque: "+muniemon.getAtaque());
			System.out.println("Defensa: "+muniemon.getDefensa());
			System.out.println("Tipo: "+ muniemon.getTipoMuniemon());	
			System.out.println("Velociad: "+muniemon.getVelocidad());
		}
	}

}
