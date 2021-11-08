package org.jboss.cdi.tck.tests.build.compatible.extensions.syntheticBeanInjectionPoint;

import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.build.compatible.spi.Parameters;
import jakarta.enterprise.inject.build.compatible.spi.SyntheticBeanCreator;
import jakarta.enterprise.inject.spi.InjectionPoint;

public class MyDependentBeanCreator implements SyntheticBeanCreator<MyDependentBean> {
    @Override
    public MyDependentBean create(Instance<Object> lookup, Parameters params) {
        lookup.select(InjectionPoint.class).get();
        return new MyDependentBean();
    }
}
