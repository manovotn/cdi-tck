package org.jboss.cdi.tck.tests.build.compatible.extensions.changeBeanQualifier;

// no bean defining annotation, registered via extension
public class MyServiceBar implements MyService {
    private static final String VALUE = "bar";

    @Override
    public String hello() {
        return VALUE;
    }
}
