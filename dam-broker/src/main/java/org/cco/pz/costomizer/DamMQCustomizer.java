package org.cco.pz.costomizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author pujw
 * <p>
 * 2019/3/21
 */
@Component
public class DamMQCustomizer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @Resource
    private DamMQConfig damMQConfig;

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        factory.setPort(damMQConfig.getPort());
    }

    public static void run (Class clazz ,String[] args){
        SpringApplication springApplication = new SpringApplication(clazz);
        springApplication.run(args);
    }
}
