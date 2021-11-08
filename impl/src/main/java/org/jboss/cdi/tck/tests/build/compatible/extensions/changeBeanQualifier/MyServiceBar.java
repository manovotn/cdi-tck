package org.jboss.cdi.tck.tests.build.compatible.extensions.changeBeanQualifier;

import jakarta.enterprise.context.Dependent;

@Dependent
public class MyServiceBar implements MyService {
    private static final String VALUE = "bar";

    @Override
    public String hello() {
        return VALUE;
    }
}
