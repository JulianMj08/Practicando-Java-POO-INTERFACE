package ConInterface;

import CochesEjercicio.Coche;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save(Coche coche) {
        System.out.println("Se ha Guardado");
    }

    @Override
    public List<Coche> findAll() {
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Se ha Eliminado");
    }
}
