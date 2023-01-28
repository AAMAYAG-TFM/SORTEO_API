package co.edu.unir.tfm.sorteo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * Representa a los jugares en el sorteo, existe una relación con la
 * organización.
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
  private JugadorNumero numeroAsignado;

  /**
   * Número de identificación del jugador, el organizador define si es el número
   * dado por el registro civil o una asignación dada por la misma entidad.
   *
   * @return Número de Identificación
   */
  @Column(name = "num_identificacion")
  @Id
  public String getNumIdentificacion() {
    return numIdentificacion;
  }

  public void setNumIdentificacion(String numIdentificacion) {
    this.numIdentificacion = numIdentificacion;
  }

  /**
   * Nombre completo del jugador, el registro se hace con "primero_nombre
   * segundo_nombre primer_apellido segundo_apellido".
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
   * Datos de la organización a la que se pertenece.
   *
   * @return Datos de la organización
   */
  @ManyToOne(optional = false, cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
  @JoinColumn(name = "ide_organizacion")
  public Organizacion getOrganizacion() {
    return organizacion;
  }

  public void setOrganizacion(Organizacion organizacion) {
    this.organizacion = organizacion;
  }

  /**
   * Retorna información del número asignado al jugador.
   *
   * @return Relación Jugador-número
   */
  @ManyToOne(fetch = FetchType.EAGER)
  @OnDelete(action = OnDeleteAction.CASCADE)
  public JugadorNumero getNumeroAsignado() {
    return numeroAsignado;
  }

  public void setNumeroAsignado(JugadorNumero numeroAsignado) {
    this.numeroAsignado = numeroAsignado;
  }

}
