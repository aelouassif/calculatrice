import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
	
class maFenetre extends JFrame
{
	
	maFenetre()
	{
		this.setTitle("calcula");
		this.setBounds(200,200,335,380);
		this.setResizable(false);
		
		
		Container C = getContentPane();
		C.setLayout(new FlowLayout());
		monEcrant = new ecrant();
		monEcrant.setVisible(true);
		C.add(monEcrant);
		
	}
	private ecrant monEcrant;
}
class ecrant extends JTextField
{
	ecrant()
	{
		super(20);
		this.setText("");
		this.setColumns(15);
		this.setPreferredSize( new Dimension( 400, 149 ));
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		this.setFont(font1);
	}
	
}
public class calculatrice 
{
	
	public static void main(String xargs[])
	{
		maFenetre fen = new maFenetre();
		fen.setVisible(true);
		  
		
	}
	
}