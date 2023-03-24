package challengeOracle;

import javax.swing.JOptionPane;

public class Exchange {
	
	//Al cambio 24/03/2023

			public void ConvertirPesosArgentinosADolares(double valor) {
				double monedaDolar = valor / 205.76;
				monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
				JOptionPane.showMessageDialog(null, "Tienes $ "+monedaDolar+ " Dolares");
			}
			
			public void ConvertirPesosArgentinosAEuros(double valor) {
				double monedaEuros = valor / 222.90;
				monedaEuros = (double) Math.round(monedaEuros * 100d)/100;
				JOptionPane.showMessageDialog(null, "Tienes $ "+monedaEuros+ " Euros");
			}
			
			public void ConvertirPesosArgentinosALibras(double valor) {
				double monedaLibras = valor / 252.76;
				monedaLibras = (double) Math.round(monedaLibras * 100d)/100;
				JOptionPane.showMessageDialog(null, "Tienes $ "+monedaLibras+ " Libras Esterlinas");
			}
			
			public void ConvertirPesosArgentinosAYen(double valor) {
				double monedaYen = valor / 1.58;
				monedaYen = (double) Math.round(monedaYen * 100d)/100;
				JOptionPane.showMessageDialog(null, "Tienes $ "+monedaYen+ " Yen Japonés");
			}
			
			public void ConvertirPesosArgentinosAWon(double valor) {
				double monedaWon = valor / 0.15;
				monedaWon = (double) Math.round(monedaWon * 100d)/100;
				JOptionPane.showMessageDialog(null, "Tienes $ "+monedaWon+ " Won sul-Coreano");
			}
			
			public void ConvertirDolaresAPesosArgentinos(double valor) {
				double monedaPesoAR = valor * 205.77;
				monedaPesoAR = (double) Math.round(monedaPesoAR * 100d)/100;
				JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoAR+ " Pesos Argentinos");
			}
			
			public void ConvertirEurosAPesosArgentinos(double valor) {
				double monedaPesoAR = valor *  205.76;
				monedaPesoAR = (double) Math.round(monedaPesoAR * 100d)/100;
				JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoAR+ "  Pesos Argentinos");
			}
			
			public void ConvertirLibrasAPesosArgentinos(double valor) {
				double monedaPesoAR = valor * 252.76;
				monedaPesoAR = (double) Math.round(monedaPesoAR * 100d)/100;
				JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoAR+ "  Pesos Argentinos");
			}
			
			public void ConvertirYenPesosArgentinos(double valor) {
				double monedaPesoAR = valor * 1.58;
				monedaPesoAR = (double) Math.round(monedaPesoAR * 100d)/100;
				JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoAR+ "  Pesos Argentinos");
			}
			
			public void ConvertirWonAPesosArgentinos(double valor) {
				double monedaPesoAR = valor * 0.15;
				monedaPesoAR = (double) Math.round(monedaPesoAR * 100d)/100;
				JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoAR+ "  Pesos Argentinos");
			}
	
	
}
