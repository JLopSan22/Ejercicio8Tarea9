package daw.progrmacion;

/**
 * Class Punto
 */
public class Punto {

  //
  // Fields
  //

  private int x;
  private int y;
  
  //
  // Constructors
  //
  public Punto () { };

  public Punto(int x, int y) {
    this.x = x;
    this.y = y;
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of x
   * @param newVar the new value of x
   */
  public void setX (int newVar) {
    x = newVar;
  }

  /**
   * Get the value of x
   * @return the value of x
   */
  public int getX () {
    return x;
  }

  /**
   * Set the value of y
   * @param newVar the new value of y
   */
  public void setY (int newVar) {
    y = newVar;
  }

  /**
   * Get the value of y
   * @return the value of y
   */
  public int getY () {
    return y;
  }

  //
  // Other methods
  //

}
