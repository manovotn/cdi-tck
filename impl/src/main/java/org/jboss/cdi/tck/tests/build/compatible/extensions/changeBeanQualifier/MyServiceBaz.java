package org.jboss.cdi.tck.tests.build.compatible.extensions.changeBeanQualifier;

// no bean defining annotation, registered via extension
public class MyServiceBaz implements MyService {
    @Override
    public String hello() {
        throw new UnsupportedOperationException();
    }
}
