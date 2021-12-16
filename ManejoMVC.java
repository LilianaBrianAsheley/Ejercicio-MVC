//@Brian Daniel Almaraz Perez S19017393
//@Ashley Gail Bonilla 	S19017398
//@Nancy Liliana Hernandez Ramirez S19017418

public class ManejoMVC {
	public static void main(String [] args) {
		Cliente modelo = llenarDatosCliente();
		ClienteVista vista = new ClienteVista();
			
		ClienteControlador controlador = new ClienteControlador(modelo, vista);		
		controlador.actualizarVista();
		
		controlador.setNombre("Ashley");
		controlador.actualizarVista();				
	}
	
	private static Cliente llenarDatosCliente() {
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNombre("Ashley");
		cliente.setApellido("Bonilla");
		return cliente;		
	}	
}
