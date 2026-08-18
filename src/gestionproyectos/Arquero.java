public class Arquero {
  private String nombre;
  private int flechas;

  public Arquero(String nombre, int flechas) {
    this.nombre = nombre;
    this.flechas = flechas;
  }

  public void dispararFlecha() {
    if (flechas > 0) {
      System.out.println(nombre + " dispara una flecha. ¡Fiuuu!");
      flechas--;
    } else {
      System.out.println(nombre + " no tiene más flechas.");
    }
  }
}
