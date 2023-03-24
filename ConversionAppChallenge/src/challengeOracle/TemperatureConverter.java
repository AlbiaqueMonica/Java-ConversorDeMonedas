package challengeOracle;

import javax.swing.JOptionPane;

public class TemperatureConverter {

	Temperature temperatura = new Temperature();
	
	public void TempConverter(double valor) {
		
		String opcion = (JOptionPane.showInputDialog(null, "Elige el de temperatura que deseas convertir", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]{
						"De Celsius a Farenheit", "De Farenheit a Celsius"},
						"Selección")).toString();
			switch(opcion) {
				case"De Celsius a Farenheit": 
					temperatura.CelsiusAFarenheit(valor);
					break;
				
				case "De Farenheit a Celsius":
					temperatura.FarenheitACelsius(valor);
					break;
			}
	}
}
