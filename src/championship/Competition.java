package championship;

import java.util.ArrayList;
import java.util.Collections;

public class Competition {

	public static void main(String[] args) {
		Participante participante1 = new Participante("laura  ",13,19);
		Participante participante2 = new Participante("ana    ",13,23);
		Participante participante3 = new Participante("kristel",11,21);
		Participante participante4 = new Participante("esteban",15,24);
		Participante participante5 = new Participante("maria  ",11,23);
		Participante participante6 = new Participante("lucia  ",14,25);
		Participante participante7 = new Participante("maria  ",13,23);
		
		
		ArrayList<Participante> participantes = new ArrayList<Participante>();
		participantes.add(participante1);
		participantes.add(participante2);
		participantes.add(participante3);
		participantes.add(participante4);
		participantes.add(participante5);
		participantes.add(participante6);
		participantes.add(participante7);
		
		
		System.out.println("Arraylist sin ordenar"); 		
		for (int i = 0; i < participantes.size();i++) 
	      { 		      
	          System.out.println(participantes.get(i).getNombre()+ "   " +participantes.get(i).getCantidadDeJuegos()+ "   " +participantes.get(i).getCantidadDePuntos() ); 		
	      }   
		
		
		System.out.println("\nArraylist usando compareTo()"); 
		
		boolean ordenado=false;
		while(!ordenado) {
			ordenado=true;
			for(int i=0;i<participantes.size()-1;i++) {
				if(participantes.get(i+1).compareTo(participantes.get(i))  <0 ) {
					Collections.swap(participantes, i, i+1);
					ordenado=false;
				}
				
			}
		}
		
	
		
		
		
		
		for (int i = 0; i < participantes.size();i++) 
	      { 		      
	          System.out.println(participantes.get(i).getNombre()+ "   " +participantes.get(i).getCantidadDeJuegos()+ "   " +participantes.get(i).getCantidadDePuntos() ); 		
	      }   
		
		
		
		
		
		
		
		
		
		
	}	
}
