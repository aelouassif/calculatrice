import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.*;
import javax.swing.*;

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
		else if(touch.equals("x²"))
		{
			System.out.println(ev.getActionCommand());
			monEcrant.setText(resultat+="²");
		}
		else if(touch.equals("="))
		{
			System.out.println(ev.getActionCommand());
//			calculer(resultat)
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
