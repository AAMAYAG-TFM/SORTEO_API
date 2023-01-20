package co.edu.unir.tfm.sorteo.entities;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * Asignación de un jugador con el número de sorteo, indica tambien si ha sido
 * ganador y de cual de los premios.
 *
 * @author aamayag
 *
 */
@Entity
@Table(name = "JUGADOR_NUMEROS")
public class JugadorNumero {

  private int numSorteo;
  private Jugador jugador;
  private Premio premio;
  private Date fecRegistro;

  /**
   * Número asignado para el sorteo.
   *
   * @return Número de sorteo
   */
  @Column(name = "num_sorteo")
  @Id
  public int getNumSorteo() {
    return numSorteo;
  }

  public void setNumSorteo(int numSorteo) {
    this.numSorteo = numSorteo;
  }

  /**
   * Datos del Jugador en el sorteo.
   *
   * @return Datos del Jugador en el sorteo
   */
  @ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JoinColumn(name = "num_identificacion")
  public Jugador getJugador() {
    return jugador;
  }

  public void setJugador(Jugador jugador) {
    this.jugador = jugador;
  }

  /**
   * Datos del premio a ser sorteado.
   *
   * @return Datos del premio a ser sorteado
   */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "ide_premio", nullable = true)
  public Premio getPremio() {
    return premio;
  }

  public void setPremio(Premio premio) {
    this.premio = premio;
  }

  /**
   * Fecha y hora de registro.
   *
   * @return fecha del registro
   */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "fec_registro", nullable = false)
  public Date getFecRegistro() {
    return fecRegistro;
  }

  public void setFecRegistro(Date fecRegistro) {
    this.fecRegistro = fecRegistro;
  }

}
