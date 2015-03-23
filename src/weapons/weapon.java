package weapons;

import transformer.Transformer;

public class weapon extends Transformer{
	static int damage;
	public static int setAttackPower(int power){	//should deal damage based on weapon used and an integer representing power
		
		if(Transformer.getFriendlyness() == false){
			int damage = power / 2 * 2;
		}else{
			int damage = power / 2;
		}
		
		Transformer.useEnergy(power / 4);
		return damage;
	}
	public static int setRange(int meters){
		return meters + Transformer.setSize(Transformer.getSize()) / 2;
	}
}
