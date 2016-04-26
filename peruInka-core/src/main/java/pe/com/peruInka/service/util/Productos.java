package pe.com.peruInka.service.util;
//@XmlRootElement(name = "person")
public class Productos {
	private String nombreProducto;
	private Double precio;
	private String descripcion;
	private String atributo;
	private String estado;
	private Long sucursalld;
	private String tipoProducto;
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAtributo() {
		return atributo;
	}
	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Long getSucursalld() {
		return sucursalld;
	}
	public void setSucursalld(Long sucursalld) {
		this.sucursalld = sucursalld;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
	

}
