package com.calderon.oddorevent;

import java.util.Scanner;

public class OddOrEvent {
	// TODO CREACION DE METODO PARA ENCAPSULAR EL PROCESO

	public void shoIsEvent() {

		if (this.isEven(this.getIntegerNumberFromUserKeyboard())) {
			System.out.println("el numero es par");
		} else {
			System.out.println("el numero es impar");
		}
	}

	// TODO creacion metodo para validar el valor del numero

	private Boolean isEven(Integer number) {
		return (number % 2 == 0) ? true : false;

		/*
		 * Boolean isEven= false; if (number % 2 == 0 ) { isEven = true; }
		 * 
		 * 
		 * return isEven;
		 */
	}

	private Integer getIntegerNumberFromUserKeyboard() {

		Integer numerFromUsereyboard = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero entero: ");
		numerFromUsereyboard = scan.nextInt();

		scan.close();

		return numerFromUsereyboard;
	}

}
