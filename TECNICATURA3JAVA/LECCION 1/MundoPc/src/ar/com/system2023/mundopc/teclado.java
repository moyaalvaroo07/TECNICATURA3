
package ar.com.system2023.mundopc;


public class teclado extends DispositivoEntrada {
     private final int idTeclado;
    private static int contadorTeclado;

    public teclado(string tipoEntrada, string marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        return "teclado{" + "idTeclado=" + idTeclado + ", " + super.toString()+ '}';
    }
    
     
}

