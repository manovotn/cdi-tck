package org.jboss.cdi.tck.tests.build.compatible.extensions.changeBeanQualifier;

import jakarta.enterprise.context.Dependent;

@Dependent
public class MyServiceBaz implements MyService {
    @Override
    public String hello() {
        throw new UnsupportedOperationException();
    }
}
