import java.util.*;


class Alumno
{

	int legajo;
	String nombre;
	String apellido;
	double promedio;
	int edad;
	Alumno(int l, String n, String a, double p, int e)
	{
		this.legajo = l;
		this.nombre = n;
		this.apellido = a;
		this.promedio = p;
		this.edad = e;		
	};
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	public void notas(int nota)
	{
		promedio = nota*0.1;
	}
}

public class TP 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Alumno> alu = new ArrayList<Alumno>();
		alu.add(new Alumno(1111, "Pepito", "Gomez", 9.0, 43 ));
		
		System.out.println("Aca Empieza el Programa :)");
		seguir(sc);
		
		//Aca entra el menu 
		menu();
		int n1 = sc.nextInt();
		Eleccion(alu, n1);
		//Segunda vuelta
		menu();
		int n2 = sc.nextInt();
		Eleccion(alu, n2);
		
	}

	private static void seguir(Scanner sc) 
	{
		System.out.println("Precione un numero para continuar");
	
		int w = sc.nextInt();
		
	}
			
	

	public static void menu() 
	{
		System.out.println("Bienvenido al menu: \n\nQue quieres hacer:\n"
				+ "1-Mostrar lista de alumnos\n"
				+ "2-Agregar alumno\n"
				+ "3-Dar de baja a alumno\n"
				+ "4-Aumentar promedio de todos\n"
				+ "5-Modificar edad de alumno\n"
				+ "0-Salir");	
				
	}
	public static void Eleccion(ArrayList<Alumno> alu, int elegido) 
	{
		Scanner sc = new Scanner(System.in);
		if(elegido == 1)
		{
			System.out.println("Eligio ver la lista de alumnos\n");
			System.out.println("Cantidad de Alumnos: " + alu.size());
			for ( Alumno a : alu )
	        {
				int n = 1;
				
	        	System.out.println
	        	("Alumno " + n +
	        	"\n\n Legajo: " + a.getLegajo() +
	        	"\n Nombre: " + a.getNombre() +
	        	"\n Apellido: " + a.getApellido() +
	        	"\n Promedio: " + a.getPromedio() + 
	        	"\n Edad: " + a.getEdad()
	        	);
	        	
	           int indice=alu.indexOf(a);
			   System.out.println(a.getNombre()+ "  Indice: "+ indice);
			   
			   n++;
			   sc.close();
	        }  
		}
		
		if(elegido == 2)
		{
			System.out.println("Eligio añadir un alumno");
			
			System.out.println("Ingresar Legajo");
			int leg = sc.nextInt();
			
			System.out.println("Ingrsar Nombre");
			String nom = sc.nextLine();
			
			System.out.println("Ingresar Apellido");
			String ape = sc.nextLine();
			
			System.out.println("Ingresar Promedio");
			double pro = sc.nextDouble();
			
			System.out.println("Ingresar Edad");
			int ed = sc.nextInt();
			
			alu.add(new Alumno(leg, nom, ape, pro, ed));
			sc.close();
		}
		
		if(elegido == 3)
		{
			System.out.println("Eligió eliminar un alumno\n");
			System.out.println("Selecciona el legajo del alumno que quiera eliminar:");
			
			int d = sc.nextInt();
			
			for(Alumno a : alu)
			{
				if (a.getLegajo()== d)
				{
					alu.remove(a);
				}
			}
			
			sc.close();
		}
		
		if(elegido == 4)
		{
			System.out.println("Eligió");
			
			
			sc.close();
		}
		
		if(elegido == 5)
		{
			
			
			sc.close();
		}
		
		if(elegido == 0)
		{
			
			
			sc.close();
		}
		else
		{
		
			sc.close();
		}
	}
}
