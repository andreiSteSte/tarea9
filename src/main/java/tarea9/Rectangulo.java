package tarea9;

/**
 * Class Rectangulo
 */
public class Rectangulo {

  //
  // Fields
  //

  private String color;
  private Float base;
  private Float altura;
  
  //
  // Constructors
  //
  public Rectangulo (String color, Float base, Float altura) {
    this.color=color;
    this.base=base;
    this.altura=altura;
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Color
   * @param newVar the new value of Color
   */
  public void setColor (String newVar) {
    color = newVar;
  }

  /**
   * Get the value of Color
   * @return the value of Color
   */
  public String getColor () {
    return color;
  }

  /**
   * Set the value of base
   * @param newVar the new value of base
   */
  public void setBase (Float newVar) {
    base = newVar;
  }

  /**
   * Get the value of base
   * @return the value of base
   */
  public Float getBase () {
    return base;
  }

  /**
   * Set the value of altura
   * @param newVar the new value of altura
   */
  public void setAltura (Float newVar) {
    altura = newVar;
  }

  /**
   * Get the value of altura
   * @return the value of altura
   */
  public Float getAltura () {
    return altura;
  }

  //
  // Other methods
  //

}
