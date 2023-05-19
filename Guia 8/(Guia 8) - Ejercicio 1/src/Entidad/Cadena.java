
package Entidad;

public class Cadena {
    private String frase;
    private int longitud;
    
    public Cadena() {
    }
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
    //getters
    public String getFrase() {
        return frase;
    }
    public int getLongitud() {
        return longitud;
    }
    //Setters
    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
