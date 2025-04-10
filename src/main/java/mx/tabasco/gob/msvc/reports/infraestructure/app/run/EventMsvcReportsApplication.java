package mx.tabasco.gob.msvc.reports.infraestructure.app.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableFeignClients(basePackages = "mx.tabasco.gob.msvc.reports.data.datasource.remote")
@SpringBootApplication()
@ComponentScan("mx.tabasco.gob")
@EnableDiscoveryClient
@EnableJpaRepositories("mx.tabasco.gob.msvc.reports.data")
@EntityScan({"mx.tabasco.gob.msvc.reports.data.entities.db"})
public class EventMsvcReportsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventMsvcReportsApplication.class, args);
    }

}
