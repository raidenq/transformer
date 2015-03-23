package vehicleForms;

import transformer.Transformer;
import transformer.VehicleForm;

public class Car extends VehicleForm{
	public void drive(int meters){
		Transformer.useEnergy(meters / 2);
	}

}
