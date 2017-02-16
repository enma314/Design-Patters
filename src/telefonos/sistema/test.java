package telefonos.sistema;

import telefonos.entidades.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Config_Own_Tel tel = new Config_Own_Tel(new Samsung(), new Camara_M_Pixels_5(), new MicroUSB());
		tel.camara.captura();
		

	}

}
