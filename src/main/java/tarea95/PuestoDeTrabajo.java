
import java.util.*;


/**
 * Class PuestoDeTrabajo
 */
public class PuestoDeTrabajo {

  //
  // Fields
  //

  private String nombrePuesto;
  private LocalDate fechaInicio;
  private LocalDate fechaFin;
  private float salario;
  private Persona trabajador;
  private Persona jefe;
  private String departamento;
  
  //
  // Constructors
  //
  public PuestoDeTrabajo () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombrePuesto
   * @param newVar the new value of nombrePuesto
   */
  public void setNombrePuesto (String newVar) {
    nombrePuesto = newVar;
  }

  /**
   * Get the value of nombrePuesto
   * @return the value of nombrePuesto
   */
  public String getNombrePuesto () {
    return nombrePuesto;
  }

  /**
   * Set the value of fechaInicio
   * @param newVar the new value of fechaInicio
   */
  public void setFechaInicio (LocalDate newVar) {
    fechaInicio = newVar;
  }

  /**
   * Get the value of fechaInicio
   * @return the value of fechaInicio
   */
  public LocalDate getFechaInicio () {
    return fechaInicio;
  }

  /**
   * Set the value of fechaFin
   * @param newVar the new value of fechaFin
   */
  public void setFechaFin (LocalDate newVar) {
    fechaFin = newVar;
  }

  /**
   * Get the value of fechaFin
   * @return the value of fechaFin
   */
  public LocalDate getFechaFin () {
    return fechaFin;
  }

  /**
   * Set the value of salario
   * @param newVar the new value of salario
   */
  public void setSalario (float newVar) {
    salario = newVar;
  }

  /**
   * Get the value of salario
   * @return the value of salario
   */
  public float getSalario () {
    return salario;
  }

  /**
   * Set the value of trabajador
   * @param newVar the new value of trabajador
   */
  public void setTrabajador (Persona newVar) {
    trabajador = newVar;
  }

  /**
   * Get the value of trabajador
   * @return the value of trabajador
   */
  public Persona getTrabajador () {
    return trabajador;
  }

  /**
   * Set the value of jefe
   * @param newVar the new value of jefe
   */
  public void setJefe (Persona newVar) {
    jefe = newVar;
  }

  /**
   * Get the value of jefe
   * @return the value of jefe
   */
  public Persona getJefe () {
    return jefe;
  }

  /**
   * Set the value of departamento
   * @param newVar the new value of departamento
   */
  public void setDepartamento (String newVar) {
    departamento = newVar;
  }

  /**
   * Get the value of departamento
   * @return the value of departamento
   */
  public String getDepartamento () {
    return departamento;
  }

  //
  // Other methods
  //

}
