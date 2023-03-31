package ConInterface;

import CochesEjercicio.Coche;

import java.util.List;

 //la interfaz exclusivamente para declarar los metodos, no se implementan

// la interfaz solo dice lo que hay que hacer pero ella no lo hace


public interface CocheCRUD {

    void save (Coche coche);

    List<Coche> findAll ();

    void delete (Coche coche);
}
