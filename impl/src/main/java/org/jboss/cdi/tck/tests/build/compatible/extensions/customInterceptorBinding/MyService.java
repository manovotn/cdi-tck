package org.jboss.cdi.tck.tests.build.compatible.extensions.customInterceptorBinding;

@MyCustomInterceptorBinding("this should be ignored, the value member should be treated as @Nonbinding")
public class MyService {
    public String hello() {
        return "Hello!";
    }
}
