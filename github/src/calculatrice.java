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
		
		//pour l'affichege
		Container C = getContentPane();
		C.setLayout(new FlowLayout());
		monEcrant = new ecrant();
		monEcrant.setVisible(true);
		C.add(monEcrant);
		
		//pour les button
		for(int i=1;i<=24;i++)
		{
			if(i<=18 && 1<=(i%6) && (i%6)<=3 )
				monButton = new button(""+(i%6+3*(i/6)));
			else
			{
				switch(i)
				{
					case 4:
						monButton = new button("÷");
						break;
					case 10:
						monButton = new button("*");
						break;
					case 11:
						monButton = new button("(");
						break;
					case 12:
						monButton = new button(")");
						break;
					case 16:
						monButton = new button("-");
						break;
					case 17:
						monButton = new button("x²");
						break;
					case 18:
						monButton = new button("√");
						break;
					case 19:
						monButton = new button("0");
						break;
					case 20:
						monButton = new button(".");
						break;
					case 21:
						monButton = new button("%");
						break;
					case 22:
						monButton = new button("+");
						break;
					default:
						monButton = new button("");
						break;
				
				}
			}
			C.add(monButton);
 		}
	}
	private ecrant monEcrant;
	private button monButton;
}
class button extends JButton implements ActionListener
{
	button(String mot)
	{
		super(mot);
		this.setPreferredSize(new Dimension(50,40));
		this.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ev)
	{
		System.out.println(ev.getActionCommand());
	}
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