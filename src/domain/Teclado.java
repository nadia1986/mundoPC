
package domain;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;
    
    public Teclado(String tipoDeEntrada, String marca){
        super(tipoDeEntrada, marca);
        this.idTeclado=++Teclado.contadorTeclados;
        
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado +","+ super.toString()+'}';
    }
    
    
}
