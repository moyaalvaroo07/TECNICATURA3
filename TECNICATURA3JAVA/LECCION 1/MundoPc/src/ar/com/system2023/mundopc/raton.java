
package ar.com.system2023.mundopc;

public class raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;

    public raton(string tipoEntrada, string marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "raton{" + "idRaton=" + idRaton + ", " + super.toString()+ '}';
    }
    
     
}
