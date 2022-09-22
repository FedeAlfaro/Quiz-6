package championship;


public class Participante implements Comparable<Participante>{
	private String nombre;
	private int cantidadDeJuegos;
	private int cantidadDePuntos;
	
	public Participante(String name,int games,int points) {
		nombre=name;
		cantidadDeJuegos=games;
		cantidadDePuntos= points;
	}

	public String getNombre() {
		return nombre;
	}


	public int getCantidadDeJuegos() {
		return cantidadDeJuegos;
	}

	public int getCantidadDePuntos() {
		return cantidadDePuntos;
	}

	@Override
	public int compareTo(Participante other) {
		int result = Integer.compare(this.cantidadDeJuegos, other.cantidadDeJuegos);
		if(result==0) {
			result =  Integer.compare(other.cantidadDePuntos,this.cantidadDePuntos);
		}
		return result;
	}

	
}
