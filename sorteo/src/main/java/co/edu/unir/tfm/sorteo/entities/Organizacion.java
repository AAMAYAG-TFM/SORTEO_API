package co.edu.unir.tfm.sorteo.entities;

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
@Entity(name = "organizacion")
@Table(schema = "public", name = "organizaciones")
public class Organizacion {

	private String ideOrganizacion;
	private Long numEmpleados;
	private String valRazonSocial;

	public Organizacion() {
	}

	public Organizacion(String identificador) {
		this.ideOrganizacion = identificador;
	}

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
	@Column(name = "val_razon_social", nullable = false)
	public String getValRazonSocial() {
		return valRazonSocial;
	}

	public void setValRazonSocial(String valRazonSocial) {
		this.valRazonSocial = valRazonSocial;
	}

	/**
	 * Hace referencia al numero de empleados que tiene la organización, con este
	 * mismo valor vamosa definir el tope de número a entregar
	 * 
	 * @return Numero de empleados
	 */
	@Column(name = "num_empleados", nullable = false)
	public Long getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(Long numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

}
