package datos.unidad1.recursividad;

public class Recursividad {

	public static void saludo(int total, String nombre) {
		if (total<=0) //Condicion Base
			return;
		
		else{	//Condicion Recursiva o repetitiva
			System.out.println("Hola"+ " " + nombre);
			saludo(total-1, nombre);
		}
	}
	
	public static void cuentaRegresiva(int n){
		if(n<1){
			return;
		
		} else {
			
			System.out.print(n + " ");
			cuentaRegresiva(n-1);
		}
	
	}
	
	public static void main(String[] args){
		String nombre = "Noemi";
		saludo(10, nombre);
		cuentaRegresiva(100);
		
	
	}
}

