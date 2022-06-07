package es.mga.mgabuda.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.mga.mgabuda")
public class DataSourceConfig {

	@Bean
	public DataSource getDataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("org.postgresql.Driver");
		dataSourceBuilder.url("jdbc:postgresql://localhost:5432/contactdb");
		dataSourceBuilder.username("postgres");
		dataSourceBuilder.password("rescue");
		return dataSourceBuilder.build();
	}
}
