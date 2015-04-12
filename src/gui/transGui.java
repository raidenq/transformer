package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.Border;

import transformer.Transformer;

public class transGui {
	public static void createFrame(){
		JFrame frame = new JFrame();
		Border myBorder = BorderFactory.createLineBorder(Color.blue);
		frame.setTitle("TransformerCreator");
		frame.setSize(700, 500);
		frame.setVisible(true);
		frame.add(Transformer.ageInput);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension myDimension = new Dimension();
		myDimension.setSize(.5, .5);
		Transformer.ageInput.setText("15");		
		JTextField outPut = new JTextField();
		outPut.setSize(15, 15);
		JButton ageButton = new JButton("set age");
		ageButton.addActionListener(new Evt());
		ageButton.setMaximumSize(myDimension);
		frame.add(ageButton);
		ageButton.setAlignmentX(5);
		ageButton.setAlignmentY(5);
		outPut.setText("age is" + String.valueOf(Transformer.getAge()) + "alive is" + String.valueOf(Transformer.getAlive()));
	}//finally
}
class Evt implements ActionListener{

	
	public void actionPerformed(ActionEvent arg0) {
		Transformer.setAge(Integer.parseInt(Transformer.ageInput.getText()));
		System.out.println(Transformer.getAge());
	}
	
}
/*
JFrame window = new JFrame();	                             //new window
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//allowing to exit on close
window.setSize(800, 400);	//sizing
window.setVisible(true);    
window.setTitle("First");
Border myBorder = BorderFactory.createLineBorder(Color.blue);
JLabel label = new JLabel();	//new label
label.setText("test");			//putting text in label
label.setBorder(myBorder);
window.add(label);
*/