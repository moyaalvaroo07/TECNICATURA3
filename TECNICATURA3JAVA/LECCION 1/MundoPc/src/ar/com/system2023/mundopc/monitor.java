package ar.com.system2023.mundopc;

public class monitor {
    private final int idMonitor;
    private string marca;
    private double tamanio;
    private static int contadorMonitores;
    
    private monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    public monitor (string marca, double tamanio) {
        this(); //el constructor vacio
        this.marca = marca;
        this.tamanio= tamanio;
        
    }

    public string getMarca() {
        return this.marca;
    }

    public void setMarca(string marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    //ingreso man ualmente el getidMonitor
    public int getIdMonitor(){
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
}
