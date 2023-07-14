import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class MySqlConnectionExample {
    public static void main(String[] args) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/nombre_basedatos");
        config.setUsername("usuario");
        config.setPassword("password");

        try (HikariDataSource dataSource = new HikariDataSource(config);
             Connection connection = dataSource.getConnection()) {
            // Realizar operaciones con la conexión
            // ...
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}