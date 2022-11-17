package co.edu.unir.tfm.sorteo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Representa los premios que tiene para sortear cada organizacion
 * 
 * @author aamayag
 *
 */
@Entity
@Table(name = "PREMIOS")
public class Premio {

	private int idePremio;
	private String valDescripcion;
	private Organizacion organizacion;
	private boolean valActivo;

	/**
	 * Identificador del Premio, n�mero generado automaticamente.
	 * 
	 * @return Identificador del premio
	 */
	@Id
	@Column(name = "ide_premio")
	public int getIdePremio() {
		return idePremio;
	}

	public void setIdePremio(int idePremio) {
		this.idePremio = idePremio;
	}

	/**
	 * Descripci�n del Premio a entregar.
	 * 
	 * @return Descripci�n del premio
	 */
	@Column(name = "val_descripcion")
	public String getValDescripcion() {
		return valDescripcion;
	}

	public void setValDescripcion(String valDescripcion) {
		this.valDescripcion = valDescripcion;
	}

	/**
	 * Datos de la Organizaci�n
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

	/**
	 * Indica si el regalo est� activo, en caso de registrarse y desistir de la
	 * entrega
	 * 
	 * @return est� activo el regalo
	 */
	@Column(name = "val_activo")
	public boolean isValActivo() {
		return valActivo;
	}

	public void setValActivo(boolean valActivo) {
		this.valActivo = valActivo;
	}

}
