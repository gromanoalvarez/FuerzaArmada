/**
 * 
 */
package ar.edu.unlam.pb2.eva03;

/**
 * @author German
 *
 */
public class Vehiculo {
	private Integer codigo; // Los vehículos de guerra se identifican unívocamente por su código.
	private String modelo;
	
	//Sobrecarga de constructor
	public Vehiculo() {}

	public Vehiculo(Integer codigo, String modelo) {
		this.codigo=codigo;
		this.modelo=modelo;
	}
	
	public Vehiculo(String codigo, String modelo) {
		this.codigo=Integer.valueOf(codigo);
		this.modelo=modelo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehiculo [codigo=" + codigo + ", modelo=" + modelo + "] \n";
	}

	
	
}
