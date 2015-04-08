package transformer;

public class VehicleForm extends Transformer{
	
	static int maxSpeed;

	public static int setSpeed(){
		return maxSpeed - Transformer.getWeight() / 4;
	}
	
	public static int getSpeed(){
		return maxSpeed;
	}
	
	public void moveAsVehicle(){
		if(Transformer.getWeight() > 500000){
			maxSpeed = 0;
			System.out.println("Your transformer is to large to move in vehicle form");			
		}else{
		Transformer.useEnergy(maxSpeed);
		}
	}
}
