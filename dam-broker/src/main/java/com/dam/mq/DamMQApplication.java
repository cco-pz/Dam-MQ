package com.dam.mq;

import com.dam.mq.costomizer.DamMQCustomizer;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author pujw
 * <p>
 * 2019/3/21
 */
@SpringBootApplication
@EnableConfigurationProperties
public class DamMQApplication extends DamMQCustomizer {

    public static void main(String[] args) {
        run(DamMQApplication.class,args);
    }
}
