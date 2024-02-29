package muniemon;

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
		do {
			System.out.println("==========Menu==========");
			System.out.println("1. Dar de alta Muniemon");
			System.out.println("2. Mostrar muniemon");
			System.out.println("3. Salir del programa");
			System.out.println("Por favor, seleccione una opcion");
			opcion= sc.nextInt();
			switch(opcion) {
			case 1:
				muniemon = altaMuniemon(sc);
				break;
			case 2:
				mostrarMuniemon(muniemon);
				break;
			case 3:
				System.out.println("Ha seleccionado la opcion de salir del programa");
				}
		}while (opcion != 3);
		
		
	}
	
	public static Muniemon altaMuniemon(Scanner sc) {
		
		System.out.println("Ha seleccionado la opcion de dar de alta al Muniemon.");
		sc.nextLine();
		System.out.println("Primero: Introduce el nombre del Muniemon");
		String nombre = sc.nextLine();
		System.out.println("Introduce la vida del Muniemon");
		int vida = sc.nextInt();
		if (vida <0) {
			System.out.println("Su Muniemon esta muerto");
		}
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
		
		Muniemon muniemon = new Muniemon(nombre, vida, ataque, defensa, tm);
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
		}
	}

}
