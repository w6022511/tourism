package org.eking.tourism.common.interceptor;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoAuth {

    /**是否拦截*/
    public boolean value() default true;

}
