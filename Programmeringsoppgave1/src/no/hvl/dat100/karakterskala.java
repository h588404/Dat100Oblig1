package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class karakterskala {

	public static void main(String[] args) {
		
		int poeng = 0;
		char karakter = 'F';
		
		for(int i = 0; i < 10; i++) {
			poeng = parseInt(showInputDialog("Skriv inn poengsum til student " + (i+1) + "."));
			while(!(poeng >= 0 && poeng <= 100)){
				poeng = parseInt(showInputDialog("ikke gyldig nummer, skriv inn på nytt"));
			}
			
			if(poeng >= 90) {
				karakter = 'A';
			} else if(poeng >= 80) {
				karakter = 'B';
			} else if(poeng >= 60) {
				karakter = 'C';
			} else if(poeng >= 50) {
				karakter = 'D';
			} else if(poeng >= 40) {
				karakter = 'E';
			} else {
				karakter = 'F';
			}
		
			showMessageDialog(null, "Student " + (i+1) + " fikk karakteren " + karakter + ".");
		}
	}

}
