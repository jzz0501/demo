import entity.Empleados;
import entity.Oficinas;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main_insert {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        /*
        Oficinas oficinas1 = createOficinas("20","orange","Av.Canarias","Santa Lucia");
        Oficinas oficinas2 = createOficinas("50","VodafoneSUR","Alcorac 50","Aguimes");
        Oficinas oficinas3 = createOficinas("10","Movistar","La Mareta","Telde");


        entityManager.persist(oficinas1);
        entityManager.persist(oficinas2);
        entityManager.persist(oficinas3);
        */

        /*
        Empleados empleados1 = createEmpleados("X12345678","emp1","direccion1","director","50");
        Empleados empleados2 = createEmpleados("X87654321","emp2","direccion1","comercial","20");
        Empleados empleados3 = createEmpleados("X18765432","emp3","direccion1","tecnico","10");


        entityManager.persist(empleados1);
        entityManager.persist(empleados2);
        entityManager.persist(empleados3);
        */

        transaction.commit();


        entityManager.close();
        entityManagerFactory.close();
    }

    public static Empleados createEmpleados(String nif, String nombre, String direccion, String cargo, String cod_ofi) {
        Empleados empleados = new Empleados();
        empleados.setNif(nif);
        empleados.setNombre(nombre);
        empleados.setDireccion(direccion);
        empleados.setCargo(cargo);
        empleados.setCodOfi(cod_ofi);
        return empleados;
    }

    public static Oficinas createOficinas(String codOfi, String nombre, String direccion, String localidad) {
        Oficinas oficinas = new Oficinas();
        oficinas.setCodOfi(codOfi);
        oficinas.setNombre(nombre);
        oficinas.setDireccion(direccion);
        oficinas.setLocalidad(localidad);
        return oficinas;
    }
}
