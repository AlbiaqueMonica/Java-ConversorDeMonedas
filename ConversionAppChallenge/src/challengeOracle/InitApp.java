package challengeOracle;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;


import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class InitApp extends javax.swing.JFrame{
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Demo Conversion App");
		frame.setSize(500,500);
		
		
		setVentanaApp(frame);	
        SelectConverter select = new SelectConverter();
        select.iniciar();
	}
	
	public InitApp(JFrame frame){
		setIconImage(getIconImage());	
		}
	
	
	@Override
	public Image getIconImage() {
		Image iValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icon-money.png"));
		return iValue;	
	}

    private static void setVentanaApp(JFrame frame) {
    	                                         
    	                                                                         
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                                  
	    frame.setResizable(false);    
	    
	    //this.getContentPane().setBackground(Color.BLUE);    
	    frame.setLocationRelativeTo(null);
	    
	    placePanels(frame);   
	    frame.setVisible(true);
	    
	   }  
    
    private static void placePanels(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		//panel.setSize(200, 200);
		frame.getContentPane().add(panel);
	}
	    
	 
	

}
