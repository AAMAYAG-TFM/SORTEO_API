package co.edu.unir.tfm.sorteo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Hace referencia a la empresa o entidad a la que pertenecen las personas que
 * van a ser parte del sorteo
 * 
 * @author aamayag
 *
 */
@Entity
@Table(name = "ORGANIZACIONES")
public class Organizacion {

	private String ideOrganizacion;
	private String valRazonSocial;

	/**
	 * Identificador de la organizaci�n dada por la entidad que regula
	 * 
	 * @return Numero de identificaci�n de la entidad
	 */
	@Id
	@Column(name = "ide_organizacion")
	public String getIdeOrganizacion() {
		return ideOrganizacion;
	}

	public void setIdeOrganizacion(String ideOrganizacion) {
		this.ideOrganizacion = ideOrganizacion;
	}

	/**
	 * Nombre de la organizaci�n o entidad
	 * 
	 * @return Nombre de la organizacion
	 */
	@Column(name = "val_razon_social")
	public String getValRazonSocial() {
		return valRazonSocial;
	}

	public void setValRazonSocial(String valRazonSocial) {
		this.valRazonSocial = valRazonSocial;
	}

}
