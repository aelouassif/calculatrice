import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;


public class maFenetre extends JFrame{
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
