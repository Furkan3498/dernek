package info.furkan.example.spring.noticeboard.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class DatabaseConfig {

	@Bean
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.setName("noticeboard")
				.setScriptEncoding("UTF-8")
				.addScript("classpath:/sql/dbschema.sql")
				.addScript("classpath:/sql/data.sql")
				.build();
	}

}
