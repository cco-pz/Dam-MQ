package com.dam.mq.costomizer;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author pujw
 * <p>
 * 2019/3/21
 */
@Component
@Data
@ConfigurationProperties(prefix = "dam")
public class DamMQConfig {

    private Integer port;

    private String registryCenter;

}
