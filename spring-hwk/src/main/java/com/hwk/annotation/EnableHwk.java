package com.hwk.annotation;

import com.hwk.selector.MySelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MySelector.class)
public @interface EnableHwk {
}
