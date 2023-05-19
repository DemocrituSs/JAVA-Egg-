
package Entidad;

public class Ahorcado {
    private char[] palabra;
    private int cantdeLetras;
    private int cantJugadas;
    //char AdivinarLetra;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int cantdeLetras, int cantJugadas) {
        this.palabra = palabra;
        this.cantdeLetras = cantdeLetras;
        this.cantJugadas = cantJugadas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public int getCantdeLetras() {
        return cantdeLetras;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
        this.cantdeLetras=palabra.length;
    }

    public void setCantdeLetras(int cantdeLetras) {
        this.cantdeLetras = cantdeLetras;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }
    
}
