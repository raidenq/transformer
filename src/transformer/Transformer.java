package transformer;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextField;


import javax.swing.border.Border;

//finally
import gui.transGui;;
public class Transformer{
	static boolean friendly;
	static boolean alive;
	static int age;
	static int energy = age / 2;
	static int size;
	public static JTextField ageInput = new JTextField();
	public static JTextField friendlyInput = new JTextField();
	public static Border myBorder = BorderFactory.createLineBorder(Color.blue);
	
	public boolean setFriendlyness(int childhood){
		if(childhood < 4){
			friendly = false;
			
		}else{
			friendly = true;
		}
		return friendly;
	}
	public static boolean getFriendlyness(){
		return friendly;
	}
	
	public static int setAge(int TransAge){
		age = TransAge;
		ageInput.setSize(25, 10);				
		if(age > 250){
			alive = false;
		}else{
			alive = true;
		}
		return age;
	}
	public static int getAge(){
		return age;
	}
	public static boolean getAlive(){
		return alive;
	}
	public void transform(){
		
	}
	public static int useEnergy(int usedEnergy){
		if(energy < 0){
			System.out.println("your transformer is out of energy");
		}else{
			energy = usedEnergy + energy / 2 * Transformer.getWeight();
		}
		
		return energy;
	}
	public static int setSize(int meters){
		
		if(meters < 1){
			System.out.println("Yout transformer is to small to be a transformer");
		}else{
			size = meters;			
		}
		return     size;
	}
	public static int getSize(){
		return size;
	}
	
	public static int getWeight(){
		int weight = size * 250;
		return weight;
	}
}
