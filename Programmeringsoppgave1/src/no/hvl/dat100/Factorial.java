package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Factorial {

	public static void main(String[] args) {
		int tall = parseInt(showInputDialog("skriv inn et heltall"));
		int factorial = 1;
		
		for(int i = 1; i <= tall; i++) {
			factorial *= i;
		}
		showMessageDialog(null, tall + " fakultet er lik " + factorial + ".");
	}

}
