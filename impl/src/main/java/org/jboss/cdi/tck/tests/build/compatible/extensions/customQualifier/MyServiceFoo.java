package org.jboss.cdi.tck.tests.build.compatible.extensions.customQualifier;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyServiceFoo implements MyService {
    public String hello() {
        return "foo";
    }
}
