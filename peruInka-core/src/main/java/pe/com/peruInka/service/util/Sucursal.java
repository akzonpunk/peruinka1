package pe.com.peruInka.service.util;
//@XmlRootElement(name = "person")
public class Sucursal {
	private String razonSocial;
	private String ruc;
	private String direccion;
	private String nroTelefono;
	private String estado;
	
	public String getRazonSocial(){
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial){
		this.razonSocial= razonSocial;
	}
	public String getRuc(){
		return ruc;
	}
	public void setRuc(String ruc){
		this.ruc=ruc;
	}
	public String getDireccion(){
		return direccion;
	}
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	public String getNroTelefono(){
		return nroTelefono;
	}
	public void setNroTelefono(String nroTelefono){
		this.nroTelefono=nroTelefono;
	}
	public String getEstado(){
		return estado;
	}
	public void setEstado(String estado){
		this.estado=estado;
	}

}
