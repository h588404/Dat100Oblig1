package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class trinnskatt {
	public static void main(String[] args) {
		Double brutto = parseDouble(showInputDialog("Skriv inn bruttolønn"));
		Double netto = 0.0;
		Double skatt = 0.0;
		int skattTrinn1 = 184800;
		int skattTrinn2 = 260100;
		int skattTrinn3 = 651250;
		int skattTrinn4 = 1021550;
		
		if(brutto > skattTrinn4) {
			netto += (brutto - skattTrinn4) * (1-0.162);
			skatt += (brutto - skattTrinn4) * 0.162;
			brutto = (double) skattTrinn4;
		}
		if(brutto > skattTrinn3) {
			netto += (brutto - skattTrinn3) * (1-0.132);
			skatt += (brutto - skattTrinn3) * 0.132;
			brutto = (double) skattTrinn3;
		}
		if(brutto > skattTrinn2) {
			netto += (brutto - skattTrinn2)*(1-0.04);
			skatt += (brutto - skattTrinn2)*0.04;
			brutto = (double) skattTrinn2;
		}
		if(brutto > skattTrinn1) {
			netto += (brutto - skattTrinn1)*(1-0.017);
			skatt += (brutto - skattTrinn1)*0.017;
			brutto = (double) skattTrinn1;
		}
		netto += brutto;
		String messageOut = "Du betalte " + skatt + " kroner i skatt \n Inntekten din etter skatt er " + netto + " kroner.";
		showMessageDialog(null, messageOut);
		
	}

}
