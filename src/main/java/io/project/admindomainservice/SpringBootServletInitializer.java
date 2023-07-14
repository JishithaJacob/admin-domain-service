package io.project.admindomainservice;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class SpringBootServletInitializer extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AdminDomainServiceApplication.class);
    }
}