package org.jboss.cdi.tck.tests.build.compatible.extensions.changeBeanQualifier;

import jakarta.enterprise.context.Dependent;

@Dependent
@MyQualifier
public class MyServiceFoo implements MyService {
    private final String value = "foo";

    @Override
    public String hello() {
        return value;
    }
}
