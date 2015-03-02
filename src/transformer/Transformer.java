package transformer;

public class Transformer{
	boolean friendly;
	boolean alive;
	int age;
	static int energy = age / 2;
	
	
	public boolean setFriendlyness(int childhood){
		if(childhood < 4){
			friendly = false;
			
		}else{
			friendly = true;
		}
		return friendly;
	}
	
	public int setAge(int robotAge){
		if(robotAge > 250){
			alive = false;
		}else{
			alive = true;
		}
		return age;
	}
	public void transform(){
		
	}
	public static int useEnergy(int usedEnergy){
		energy = usedEnergy + energy;
		return energy;
	}
}
