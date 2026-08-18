public class Mago {
  private String nombre;
  private int nivelMagia;

  // Constructor
  public Mago(String nombre, int nivelMagia) {
    this.nombre = nombre;
    this.nivelMagia = nivelMagia;
  }

  // Primer método
  public void lanzarHechizo() {
    System.out.println(nombre + " ha lanzado un hechizo de fuego.");
    this.nivelMagia -= 10;
  }
  // Segundo método
  public void meditar() {
    this.nivelMagia += 20;
    System.out.println(nombre + " recupera magia. Nivel actual: " + nivelMagia);
  }
}
