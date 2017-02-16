package telefonos.entidades;

public class Config_Own_Tel {
	
	public Telefono telefono;
	public Camara camara;
	public USB usb;
	
	public Config_Own_Tel(Telefono telefono, Camara camara, USB usb) {
		super();
		this.telefono = telefono;
		this.camara = camara;
		this.usb = usb;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public USB getUsb() {
		return usb;
	}

	public void setUsb(USB usb) {
		this.usb = usb;
	}
	
	

}
