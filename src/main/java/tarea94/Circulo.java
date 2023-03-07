

/**
 * Class Circulo
 */
public class Circulo extends Cónica {

  //
  // Fields
  //

  private String color;
  private Float radio;
  
  //
  // Constructors
  //
  public Circulo () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of color
   * @param newVar the new value of color
   */
  public void setColor (String newVar) {
    color = newVar;
  }

  /**
   * Get the value of color
   * @return the value of color
   */
  public String getColor () {
    return color;
  }

  /**
   * Set the value of radio
   * @param newVar the new value of radio
   */
  public void setRadio (Float newVar) {
    radio = newVar;
  }

  /**
   * Get the value of radio
   * @return the value of radio
   */
  public Float getRadio () {
    return radio;
  }

  //
  // Other methods
  //

}
