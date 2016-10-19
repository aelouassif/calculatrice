import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
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
				monButton = new button(""+(i%6+3*(i/6)),monEcrant);
			else
			{
				switch(i)
				{
					case 4:
						monButton = new button("÷",monEcrant);
						break;
					case 10:
						monButton = new button("*",monEcrant);
						break;
					case 11:
						monButton = new button("(",monEcrant);
						break;
					case 12:
						monButton = new button(")",monEcrant);
						break;
					case 16:
						monButton = new button("-",monEcrant);
						break;
					case 17:
						monButton = new button("x²",monEcrant);
						break;
					case 18:
						monButton = new button("√",monEcrant);
						break;
					case 19:
						monButton = new button("0",monEcrant);
						break;
					case 20:
						monButton = new button(".",monEcrant);
						break;
					case 21:
						monButton = new button("%",monEcrant);
						break;
					case 22:
						monButton = new button("+",monEcrant);
						break;
					case 24:
						monButton = new button("=",monEcrant);
						break;
					default:
						monButton = new button("",monEcrant);
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
	button(String mot,ecrant e)
	{
		super(mot);
		this.setPreferredSize(new Dimension(50,40));
		this.addActionListener(this);
		this.monEcrant = e;
	}
	public void actionPerformed(ActionEvent ev) 
	{
		String touch = ev.getActionCommand();
		
		if(touch.equals("1"))
		{
				System.out.println(ev.getActionCommand());
				monEcrant.setText(resultat+="1");
		}
		else if(touch.equals("2"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="2");
		}
		else if(touch.equals("3"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="3");
		}
		else if(touch.equals("4"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="4");
		}
		else if(touch.equals("5"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="5");
		}
		else if(touch.equals("6"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="6");
		}
		else if(touch.equals("7"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="7");
		}
		else if(touch.equals("8"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="8");
		}
		else if(touch.equals("9"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="9");
		}
		else if(touch.equals("0"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="0");
		}
		else if(touch.equals("."))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+=".");
		}
		else if(touch.equals("+"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="+");
		}
		else if(touch.equals("-"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="-");
		}
		else if(touch.equals("*"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="*");
		}
		else if(touch.equals("÷"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="/");
		}
		else if(touch.equals("("))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="(");
		}
		else if(touch.equals(")"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+=")");
		}
		else if(touch.equals(")"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+=")");
		}
		else if(touch.equals("="))
		{
			System.out.println(ev.getActionCommand());
//			calculer(resultat);
			try {calculer(resultat);} catch(ScriptException ex){};
			monEcrant.setText(resultat);
			resultat = "";
		}

	}
	public static void calculer(String mot)throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		Object result = "";
	    result = engine.eval(mot);
	    resultat = result.toString();
	    System.out.print(resultat);
//	    monEcrant.setText(resultat); //si j'essai ici de modifier l'ecant il donne une erreur a l'execution
	    return ;
	    
	}
	public static String resultat = "";
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