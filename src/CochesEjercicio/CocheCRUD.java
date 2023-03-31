package CochesEjercicio;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUD {

    // Emulamos una Base de datos

   List<Coche> coches = new ArrayList<>();


    public void save(Coche coche){
        coches.add(coche);
    }

    public List<Coche> findAll() {
        return coches;
    }

    public void delete(Coche coche){
        coches.remove(coche);
    }
}
