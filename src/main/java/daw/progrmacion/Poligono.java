package daw.progrmacion;

import java.util.ArrayList;

/**
 * Class Poligono
 */
public class Poligono {

  ArrayList<Punto> puntos = new ArrayList<>();

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Poligono (Punto punto1, Punto punto2, Punto punto3) {
    puntos = new ArrayList<>();
    puntos.add(punto1);
    puntos.add(punto2);
    puntos.add(punto3);
  };
  
  //
  // Methods
  //
  public void AñadirPunto(Punto punto){
    puntos.add(punto);
  }

  //
  // Accessor methods
  //

  //
  // Other methods
  //

}
