package org.jboss.cdi.tck.tests.build.compatible.extensions.syntheticBeanInjectionPoint;

import jakarta.enterprise.inject.Instance;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.cdi.tck.AbstractTest;
import org.jboss.cdi.tck.shrinkwrap.WebArchiveBuilder;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.test.audit.annotations.SpecVersion;
import org.testng.annotations.Test;

@SpecVersion(spec = "cdi", version = "4.0")
public class SyntheticBeanInjectionPointTest extends AbstractTest {
    @Deployment
    public static WebArchive createTestArchive() {
        return new WebArchiveBuilder()
                .withTestClassPackage(SyntheticBeanInjectionPointTest.class)
                .withBuildCompatibleExtension(SyntheticBeanInjectionPointExtension.class)
                .build();
    }

    @Test
    //@SpecAssertion(section = TODO, id = "TODO")
    public void test() {
        Instance<Object> lookup = getCurrentBeanContainer().createInstance();

        // this use of InjectionPoint is legitimate
        Instance.Handle<MyDependentBean> handle = lookup.select(MyDependentBean.class).getHandle();
        handle.get();
    }
}
