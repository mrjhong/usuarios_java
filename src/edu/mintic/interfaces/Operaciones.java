package edu.mintic.interfaces;

import java.util.List;

public interface Operaciones<T> {

    public boolean agregar(T miObjeto);
    
    public boolean borrar(T miObjeto);
    
    public boolean actualizar(T miObjeto);

    public List<T> consultar(String orden);

    public T buscar(Integer llavePrimaria);
}
