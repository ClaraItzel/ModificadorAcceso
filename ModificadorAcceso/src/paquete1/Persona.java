package paquete1;
public class Persona {
	String nombre= "";
	//Modificador Privado
	private int edad= 500;
	//Protected visto desde la misma clase y paquete
	protected String domicilio= "Gotham #24";
	//Public visible para todo el programa
	public float Estatura= 1.30f;
	String saludar() {
		return "Hola, mi nombre es " + this.nombre+" y tu edad "
				+ this.edad;
	}
}
