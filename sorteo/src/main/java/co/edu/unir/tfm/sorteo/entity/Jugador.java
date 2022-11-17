package co.edu.unir.tfm.sorteo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Representa a los jugares en el sorteo, existe una relaci�n con la
 * organizaci�n
 * 
 * @author aamayag
 *
 */

@Entity
@Table(name = "JUGADORES")
public class Jugador {

	private String numIdentificacion;
	private String valNombre;
	private Organizacion organizacion;

	/**
	 * N�mero de identificaci�n del jugador, el organizador define si es el n�mero
	 * dado por el registro civil o una asignaci�n dada por la misma entidad
	 * 
	 * @return N�mero de identificaci�n
	 */
	@Column(name = "num_identificacion")
	public String getNumIdentificacion() {
		return numIdentificacion;
	}

	public void setNumIdentificacion(String numIdentificacion) {
		this.numIdentificacion = numIdentificacion;
	}

	/**
	 * Nombre completo del jugador, el registro se hace con "primero_nombre
	 * segundo_nombre primer_apellido segundo_apellido"
	 * 
	 * @return Nombre del jugador
	 */
	@Column(name = "val_nombre")
	public String getValNombre() {
		return valNombre;
	}

	public void setValNombre(String valNombre) {
		this.valNombre = valNombre;
	}

	/**
	 * Datos de la organizaci�n a la que se pertenece
	 * 
	 * @return Datos de la organizaci�n
	 */
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "ide_organizacion")
	public Organizacion getOrganizacion() {
		return organizacion;
	}

	public void setOrganizacion(Organizacion organizacion) {
		this.organizacion = organizacion;
	}

}
