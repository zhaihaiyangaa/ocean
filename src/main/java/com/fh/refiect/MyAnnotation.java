package com.fh.refiect;


import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)//用于描述注解使用范围
@Retention(RetentionPolicy.RUNTIME)//定义了注解被保留的时间长短
public @interface MyAnnotation {
    String value();
}
