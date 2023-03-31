import CochesEjercicio.Coche;
import CochesEjercicio.CocheCRUD;
import ConInterface.CocheCRUDImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Ejecucion de las bases de datos

        CocheCRUD cocheCRUD = new CocheCRUD();

        Coche mazda = new Coche("Azul", "spart", 1600, true, "FHE134", 8.000);
        Coche chevrolet = new Coche("Red", "Sail", 1600, true, "KJV174", 9.900);

        System.out.println(mazda);
        System.out.println(chevrolet);


        cocheCRUD.save(mazda);
        cocheCRUD.save(chevrolet);
    }

}