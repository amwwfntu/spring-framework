package com.hwk.annotation;

import com.hwk.context.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface MyMapperScan {

	String value();
}
