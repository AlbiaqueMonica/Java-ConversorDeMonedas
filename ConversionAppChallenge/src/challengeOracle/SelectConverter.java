package challengeOracle;


import javax.swing.JOptionPane;

public class SelectConverter {
	
	public  void iniciar()  {
		
		Object [] op ={"Conversor de Moneda","Conversor de Temperatura"}; 
	
		
		Object select =(JOptionPane.showInputDialog(null, "Selecciones una opción de conversión", "Menú",JOptionPane.QUESTION_MESSAGE, null, op, op[0]));
			
		if(select != null) {
			
			String selectedOpcion = (String) select;
			
			
				
			switch (selectedOpcion){
			
			case "Conversor de Moneda" :
				
				
				  CurrencyProcess currency = new CurrencyProcess();
				  //currency.currencyStart();
				 
				  try {
						String input = JOptionPane.showInputDialog(null, "Ingrese un Valor");
						double valorRecibido = Double.parseDouble(input);
						currency.CurrencyValue(valorRecibido);
						}
						catch(Exception e) {
							JOptionPane.showMessageDialog(null, "Valor no Válido");
							
						}
					
						int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
						if(JOptionPane.OK_OPTION == respuesta) {
							
							iniciar();
						} else {
							JOptionPane.showMessageDialog(null, "Gracias por usar el Conversor");
							System.exit( 0 );
						}
				
				break;
				
					
			
			case  "Conversor de Temperatura":
				TemperatureConverter temp = new TemperatureConverter();
				try {
					
					String inputTemperatura = JOptionPane.showInputDialog(null, "Ingrese un Valor");
					double valorRecibido = Double.parseDouble(inputTemperatura);
					temp.TempConverter(valorRecibido);
					}
					catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Valor no Válido");
					
					}
				
					int respuestaTemperatura = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if(JOptionPane.OK_OPTION == respuestaTemperatura) {
						
						iniciar();
					} else {
						JOptionPane.showMessageDialog(null, "Gracias por usar el Conversor");
						System.exit( 0 );
					}
					
					break;
			
					default:
					break;
			
				
			}
			
		}else{
			JOptionPane.showMessageDialog(null, "NO SE SELECCIONO NNGUNA OPCION");
			JOptionPane.showMessageDialog(null,  "Gracias por usar el Conversor");
			System.exit( 0 );
			
		}
		
		
		
	}
}

