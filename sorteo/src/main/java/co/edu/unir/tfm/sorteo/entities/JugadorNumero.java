package co.edu.unir.tfm.sorteo.entities;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Asignaci�n de un jugador con el n�mero de sorteo, indica tambien si ha sido
 * ganador y de cual de los premios
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
	private Timestamp fecRegistro;

	/**
	 * N�mero asignado para el sorteo
	 * 
	 * @return N�mero de sorteo
	 */
	@Column(name = "num_sorteo")
	public int getNumSorteo() {
		return numSorteo;
	}

	public void setNumSorteo(int numSorteo) {
		this.numSorteo = numSorteo;
	}

	/**
	 * Datos del Jugador en el sorteo
	 * 
	 * @return Datos del Jugador en el sorteo
	 */
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "num_identificacion")
	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	/**
	 * Datos del premio a ser sorteado
	 * 
	 * @return Datos del premio a ser sorteado
	 */
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "ide_premio")
	public Premio getPremio() {
		return premio;
	}

	public void setPremio(Premio premio) {
		this.premio = premio;
	}

	/**
	 * Fecha y hora de registro
	 * 
	 * @return
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fec_registro", nullable = false)
	public Timestamp getFecRegistro() {
		return fecRegistro;
	}

	public void setFecRegistro(Timestamp fecRegistro) {
		this.fecRegistro = fecRegistro;
	}

}
