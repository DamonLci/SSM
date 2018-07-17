package org.home.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface MyClass {

    String name() default "djj";
    int id() default 12;

}
