package general;

import general.client.ClientCrudService;
import general.planet.PlanetCrudService;
import lombok.SneakyThrows;
import org.hibernate.Session;



public class Main {
    @SneakyThrows
public static void main(String[] args) {
    new FlywayMigrat().flywayMigrat();

    Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
    System.out.println("Client name is: " + new ClientCrudService().getById(2));
//    System.out.println("Created new client: " + new ClientCrudService().createNewClient("Piter"));
//    new ClientCrudService().deleteById(6);

    System.out.println("Planet name is: " + new PlanetCrudService().getByIdPlanet("M40"));
//    System.out.println("Created new planet: " + new PlanetCrudService().createNewPlanet("U60","Uran"));
//    new PlanetCrudService().setNamePlanet("U60","VUran");
//    new PlanetCrudService().deleteByIdPlanet("Uran");

    session.close();
    HibernateUtil.getInstance().close();
    }
}
