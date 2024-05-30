
package ar.com.system2023.mundopc;


public class DispositivoEntrada {
    private string tipoEntrada;
    private string marca;
    
    public DispositivoEntrada (string tipoEntrada, string marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
        
    }

    public string getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(string tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public string getMarca() {
        return marca;
    }

    public void setMarca(string marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
}
