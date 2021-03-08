package mx.unam.aragon.fes.persistencia;

import java.util.ArrayList;
import mx.unam.aragon.fes.Empleado;

/**
 *
 * @author alorn
 */
public class ArchivoEmpleado {
    private String archivo;

    public ArchivoEmpleado() {
    }

    public ArchivoEmpleado(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    public void guardarEmpleados(ArrayList<Empleado> datos){
        //aqui el coidgo para grabar en disco duro
    }
    
    public ArrayList<Empleado> leerEmpleado(){
        ArrayList<Empleado> tmp=null;
        
        // leer el disco duro
        // se sube el arraylist tmp
        
        return tmp;
    }
    
}
