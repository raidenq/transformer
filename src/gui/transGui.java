package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import transformer.Transformer;
//finally
//finally
//finally
public class transGui {
	
	static JFrame frame = new JFrame();
	static JButton ageButton = new JButton("set age");
	static JTextField outPut = new JTextField();
	static JPanel myPanel = new JPanel();
	static JTextField ageInput = new JTextField();
	static Dimension outPutDim = new Dimension();
	static Dimension myDimension = new Dimension();
	
	public static void createFrame(){
		
		Border myBorder = BorderFactory.createLineBorder(Color.blue);
		frame.setTitle("TransformerCreator");
		frame.setSize(700, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		outPutDim.setSize(25, 25);

		myDimension.setSize(250, 75);
		
	
			
		ageInput.setPreferredSize(outPutDim);
		
		
		
		ageButton.addActionListener(new action());
		ageButton.setPreferredSize(myDimension);
		
		ageButton.setAlignmentX(5);
		ageButton.setAlignmentY(5);
		
		
		
		myPanel.add(ageButton);
		myPanel.add(outPut);
		myPanel.add(ageInput);
		
		frame.add(myPanel);
	

		
	}
	
	
	
}


	

