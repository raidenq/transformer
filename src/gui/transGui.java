package gui;

import javax.swing.JFrame;
import javax.swing.JTextField;

import transformer.Transformer;

public class transGui {
	public static void Frame(){
		JFrame frame = new JFrame();
		frame.setTitle("TransformerCreator");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(Transformer.ageInput);
	
	}
}
