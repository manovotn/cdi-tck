package org.jboss.cdi.tck.tests.build.compatible.extensions.changeBeanQualifier;

import jakarta.enterprise.context.Dependent;
import org.jboss.arquillian.core.api.annotation.Inject;

@Dependent
public class MyOtherService {
    @Inject
    MyService myService;
}
