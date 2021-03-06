package com.teavamc.vamsam.dubboutils;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 异常封装为标准返回值
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Import({ DubboAspectConfigure.class })
public @interface EnableDubboUtil {
}
