package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion 

{
	

 
	public static void main(String[] args)
	
	 {
	
	   System.out.println("Hola, mundo!");
	   

	   try
		{
		   CalculadoraEstadisticas calculadora = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		   	System.out.println("Se cargó el archivo con información de los Juegos Olímpicos.");
		   	Map<String, Integer> paises= calculadora.paisConMasMedallistas();
		   	for (String nombre : paises.keySet())
			{
				System.out.println("El país con más medallistas es "+nombre+ " con " +paises.get(nombre)+ " medallas" );
			}
			
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		} 
	   
		
		

	}
	
	
	

	
}