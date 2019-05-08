package com.dam.mq.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author pujw
 * <p>
 * 2019/4/16
 */
@Service
@Component
public class DamServiceImpl implements DamService {
    @Override
    public void say(String someThing) {
        System.out.println(someThing);
    }
}
