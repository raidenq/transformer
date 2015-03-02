package transformer;

public class RobotForm extends Transformer{
	int size;
	public void attack(int power){
		Transformer.useEnergy(power);
	}
	public void move(int distence){
		Transformer.useEnergy(distence);
	}
	
}
