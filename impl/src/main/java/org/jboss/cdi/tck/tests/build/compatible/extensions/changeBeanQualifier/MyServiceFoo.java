package org.jboss.cdi.tck.tests.build.compatible.extensions.changeBeanQualifier;

// no bean defining annotation, registered via extension
@MyQualifier
public class MyServiceFoo implements MyService {
    private final String value = "foo";

    @Override
    public String hello() {
        return value;
    }
}
