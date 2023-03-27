package daw.progrmacion;

public class Main {
    public static void main(String[] args) {
        Punto pt1 = new Punto(0,0);
        Punto pt2 = new Punto(0,1);
        Punto pt3 = new Punto(1,1);
        Punto pt4 = new Punto(1,2);

        // Triángulo
        Poligono triangulo = new Poligono(pt1, pt2, pt3);

        // Cuadrado
        Poligono cuadrado = new Poligono(pt1, pt2, pt3);
        cuadrado.AñadirPunto(pt4);
    }
}