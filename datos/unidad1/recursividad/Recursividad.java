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
	
	/**
	**Funcion que realiza cuenta regresiva de acuerdo a un
	*valor entero
	*Fecha: 25 Septiembre
	*Autor: Angel Nolasco
	*/
	
	public static void cuentaRegresiva(int n){
		if(n<1){
			return;
		
		} else {
			
			System.out.println(n + " ");
			cuentaRegresiva(n-1);
		}
	
	}
	

	/**
	**Funcion que realiza suma de un arreglo con recursividad
	**Fecha: 25 Septiembre
	*Autor: Angel Nolasco
	*/
	
	public static int sumaRecursiva(int[] datos, int tam){
		if(tam<0){
			return 0;
		}else{
			return datos[tam]+sumaRecursiva(datos, tam-1);
		}
	} 

	public static void main(String[] args){
		String nombre = "Noemi";
		saludo(10, nombre);
		cuentaRegresiva(100);
		int[] datos = {3,4,5,6,7,8};
		
		int suma = sumaRecursiva(datos, datos.length - 1);
		System.out.println("La suma del arreglo es: " + suma);
		
	
	}
}

