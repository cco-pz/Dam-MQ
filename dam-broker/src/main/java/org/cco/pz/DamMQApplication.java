package org.cco.pz;

import org.cco.pz.costomizer.DamMQCustomizer;
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
