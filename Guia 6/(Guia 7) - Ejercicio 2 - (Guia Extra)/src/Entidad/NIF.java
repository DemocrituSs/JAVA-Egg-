package Entidad;

public class NIF {
    private long numero_DNI;
    private char letra;

    public NIF() {
    }
    
    public NIF(long numero_DNI, char letra) {
        this.numero_DNI = numero_DNI;
        this.letra = letra;
    }

    public long getNumero_DNI() {
        return numero_DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setNumero_DNI(long numero_DNI) {
        this.numero_DNI = numero_DNI;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
}
