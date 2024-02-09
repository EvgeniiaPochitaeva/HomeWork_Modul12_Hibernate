package general;
import org.flywaydb.core.Flyway;

public class FlywayMigrat {
    public void flywayMigrat(){
        Flyway flyway = Flyway
                .configure()
                .baselineOnMigrate(true)
                .dataSource("jdbc:h2:./mydb", "", "")
                .load();
        flyway.migrate();
    }
}


