//@Brian Daniel Almaraz Perez S19017393
//@Ashley Gail Bonilla 	S19017398
//@Nancy Liliana Hernandez Ramirez S19017418

public class ClienteControlador {
	
	private ClienteVista vista;
	private Cliente modelo;
 	
	public ClienteControlador(Cliente modelo, ClienteVista vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
 	
	public int getId() {
		return modelo.getId();
	}
	public void setId(int id) {
		this.modelo.setId(id);
	}
	public String getNombre() {
		return modelo.getNombre();
	}
	public void setNombre(String nombre) {
		this.modelo.setNombre(nombre); 
	}
	public String getApellido() {
		return modelo.getApellido();
	}
	public void setApellido(String apellido) {
		this.modelo.setApellido(apellido);
	}
	
	public void actualizarVista() {
		vista.imprimirDatosClientes(modelo.getId(),modelo.getNombre(), modelo.getApellido());
	}
}