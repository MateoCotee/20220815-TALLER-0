package uniandes.dpoo.taller0.modificacion;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;
import java.io.IOException;

public class modificacion
{
	public static void main(String[] args)
	{
		System.out.println("Hola, mundo!");
		CalculadoraEstadisticas calc;
		try {
			calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
			System.out.println(calc.paisConMasMedallistas());
		} catch (IOException texto) {
			texto.printStackTrace();
		}
		
	}
}
