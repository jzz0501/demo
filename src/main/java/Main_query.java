import entity.Empleados;
import jakarta.persistence.*;

import java.util.List;

public class Main_query {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();


        /* //(a.Obtener todos los datos de los empleados)

        TypedQuery<Empleados> query = em.createQuery("select e from Empleados e", Empleados.class);
        List<Empleados> list = query.getResultList();

        list.forEach(System.out::println);
        */


        /* //(b.Modificar el cargo de todos los empleados de la oficina 50, de forma que sean todos comerciales)

        Query query = em.createQuery("update Empleados e set e.cargo = 'comerciales' where e.codOfi = '50'");
        query.executeUpdate();

        */


        /* //(c.Mostrar cuántos empleados hay por cada oficina (con funcion de agrupamiento))

        TypedQuery<Object[]> query = em.createQuery("select " +
                                                "o.nombre, count(*) " +
                                                "from Oficinas o, Empleados e " +
                                                "where e.codOfi = o.codOfi " +
                                                "group by o.nombre"
                , Object[].class);

        List<Object[]> list = query.getResultList();

        for(Object[] objects: list) {
            for(Object object: objects) {
                System.out.print(object + "   ");
            }
            System.out.println();
        }

        */


        /* //(d.Obtener el nombre de las oficinas de Telde, donde la localidad sera pasado por parámetro (con el método que tú elijas))

        TypedQuery<Object[]> query = em.createQuery("select o.nombre from Oficinas o where o.localidad=:loc", Object[].class);
        query.setParameter("loc","Telde");
        List<Object[]> list = query.getResultList();

        for(Object[] objects: list) {
            for(Object object: objects) {
                System.out.print(object + "   ");
            }
            System.out.println();
        }

        */

        /* //(e.Elimina las oficinas de Telde.)

        Query query = em.createQuery("delete from Oficinas o where o.localidad = 'Telde'");
        query.executeUpdate();

        */

        em.getTransaction().commit();

    }

}
