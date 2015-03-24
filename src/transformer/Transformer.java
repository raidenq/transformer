package transformer;

public class Transformer{
	static boolean friendly;
	static boolean alive;
	static int age;
	static int energy = age / 2;
	static int size;
	
	
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
	
	public int setAge(int robotAge){
		age = robotAge;
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
	public void transform(){
		
	}
	public static int useEnergy(int usedEnergy){
		if(energy < 0){
			System.out.println("your transformer is out of energy");
		}else{
			energy = usedEnergy + energy;
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
}
