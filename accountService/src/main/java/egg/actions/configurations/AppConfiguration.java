package egg.actions.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "egg.actions.services",
        "egg.actions.repository",
        "egg.actions.facades"})
public class AppConfiguration {
}
