package procesos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CurrencyConverterV2 {

	public static void main(String[] args) {
		
	}

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel quantityLabel = new JLabel("Quantity");
		quantityLabel.setBounds(30, 30, 80, 25);
		panel.add(quantityLabel);

		JTextField quantityText = new JTextField(20);
		quantityText.setBounds(100, 30, 160, 25);
		panel.add(quantityText);

		JLabel fromLabel = new JLabel("From");
		fromLabel.setBounds(30, 70, 80, 25);
		panel.add(fromLabel);
		
		JLabel origenLabel = new JLabel("Moneda Origen");
		origenLabel.setBounds(100, 70, 160, 25);
		panel.add(origenLabel);
		
						
		JLabel toLabel = new JLabel("To");
		toLabel.setBounds(30, 110, 80, 25);
		panel.add(toLabel);
		
		JLabel destinoLabel = new JLabel("Moneda Destino");
		destinoLabel.setBounds(100, 110, 160, 25);
		panel.add(destinoLabel);

		
		
		JButton convertButton = new JButton("Convert");
		convertButton.setBounds(95,180, 80, 25);
		panel.add(convertButton);
		
		
	}
	
	public void currencyStart() {
		
		JFrame frame = new JFrame("Currency Converter");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);
		
		frame.setVisible(true);
	}

}
