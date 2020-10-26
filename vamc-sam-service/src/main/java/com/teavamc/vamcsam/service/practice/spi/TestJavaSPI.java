package com.teavamc.vamcsam.service.practice.spi;

import com.teavamc.vamcsam.service.practice.tools.PrintTools;
import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

/**
 * @author 墨诚 mocheng@byai.com
 * @Package com.teavamc.vamcsam.service.practice.spi
 * @date 2020/10/26 10:37
 */
public class TestJavaSPI {

    @Test
    public void sayHello(){
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        PrintTools.printInfo("Java SPI Test");
        serviceLoader.forEach(Robot::sayHello);
    }
}
