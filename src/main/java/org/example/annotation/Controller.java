package org.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //Class, interface, enum 에 사용할 수 있는 어노테이션
@Retention(RetentionPolicy.RUNTIME) //유지기간은 런타임까지
public @interface Controller {
}
