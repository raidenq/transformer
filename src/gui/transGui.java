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
	
	
	public static void createFrame(){
		JFrame frame = new JFrame();
		JButton ageButton = new JButton("set age");
		JTextField outPut = new JTextField();
		JPanel myPanel = new JPanel();
		JTextField ageInput = new JTextField();
		
		Border myBorder = BorderFactory.createLineBorder(Color.blue);
		frame.setTitle("TransformerCreator");
		frame.setSize(700, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Dimension outPutDim = new Dimension();
		outPutDim.setSize(25, 25);
		Dimension myDimension = new Dimension();
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
	//finally
	
		
	}
	public String getAge(){
		return ageInput.getText();
	}
}


	

