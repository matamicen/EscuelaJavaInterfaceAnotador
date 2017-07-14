package com.captton.programa;

import java.util.ArrayList;

import com.captton.interfaces.Computadora;
import com.captton.interfaces.IAnotador;
import com.captton.interfaces.Lapicera;

public class inicio {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IAnotador l = new Lapicera();
		l.anotar("Hola soy lapicera");
		Lapicera lapi = new Lapicera();
		lapi.anotar("desde instancia Lapicera");
		
		IAnotador c = new Computadora();
		c.anotar("Soy compu");
		
		Computadora compu = new Computadora();
		compu.anotar("Desde inst Computadora");
		compu.Encender();
		
		
		// otro ejemplo Hacer el ejemplo de arriba y luego explicar el concepto de Instnacia de 
		
		ArrayList<IAnotador> anotadores = new ArrayList<IAnotador>();
		anotadores.add(l);
		anotadores.add(c);
		
		
		for(IAnotador i: anotadores)
		{
			i.anotar("el mensjae");
			
			if (i instanceof Lapicera)
			{ System.out.println("Es lapicera");
			
			} else { System.out.println("Es computadora");
			         ((Computadora)i).Encender(); }              }
			
		}
		
		
		

	}


