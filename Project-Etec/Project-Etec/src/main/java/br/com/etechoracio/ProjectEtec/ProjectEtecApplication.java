package br.com.etechoracio.ProjectEtec;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectEtecApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectEtecApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean<FacesServlet> servletRegistrationBean(){
		return new ServletRegistrationBean<FacesServlet>(new FacesServlet(), "*.xhtml");
	}
	
}
