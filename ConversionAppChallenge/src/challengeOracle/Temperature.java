package challengeOracle;
import javax.swing.JOptionPane;

public class Temperature {
	public void CelsiusAFarenheit(double valor) {
		double farenheit = valor * 1.8;
		double totalfarenheit = farenheit + 32;
		JOptionPane.showMessageDialog(null, valor + " grados Celsius corresponden a "+ totalfarenheit + " grados Farenheit");
	}
	
	public void FarenheitACelsius(double valor) {
		double celsius = valor - 32;
		double totalCelsius = celsius / 1.8;
		JOptionPane.showMessageDialog(null,  valor + " grados Farenheit corresponden a "+ totalCelsius + " grados Celsius");
	}

}
