package org.jboss.cdi.tck.tests.build.compatible.extensions.customStereotype;

@DummyStereotype
@MyCustomStereotype
public class MyService {
    public String hello() {
        return "Hello!";
    }
}
