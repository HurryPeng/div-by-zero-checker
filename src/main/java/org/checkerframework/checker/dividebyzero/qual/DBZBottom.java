package org.checkerframework.checker.dividebyzero.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

@SubtypeOf({DBZZero.class, DBZNotZero.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface DBZBottom {}
