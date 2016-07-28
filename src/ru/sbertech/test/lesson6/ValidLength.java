package ru.sbertech.test.lesson6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Student on 28.07.2016.
 */

// по умолчанию @Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidLength {
    int value() default 4;
}
