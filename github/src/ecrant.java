import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

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
