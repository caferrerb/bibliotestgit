package co.edu.eam.biblioteca.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
Entidad del autor.
**/
@Table(name="autor")
@Entity
public class Autor implements Serializable {

	@Id
	private String codigo;
	
	private String  nombre;
	
	private String pais;
	
	public Autor() {
	}
	
	

	public Autor(String codigo, String nombre, String pais) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.pais = pais;
	}



	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
