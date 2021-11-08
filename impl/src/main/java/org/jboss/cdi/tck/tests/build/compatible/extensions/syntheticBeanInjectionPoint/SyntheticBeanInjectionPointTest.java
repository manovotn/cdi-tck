package org.jboss.cdi.tck.tests.build.compatible.extensions.syntheticBeanInjectionPoint;

import jakarta.enterprise.inject.Instance;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.cdi.tck.AbstractTest;
import org.jboss.cdi.tck.shrinkwrap.WebArchiveBuilder;
import org.jboss.cdi.tck.tests.context.MyApplicationBean;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.test.audit.annotations.SpecVersion;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

@SpecVersion(spec = "cdi", version = "4.0")
public class SyntheticBeanInjectionPointTest extends AbstractTest {
    @Deployment
    public static WebArchive createTestArchive() {
        // no beans.xml + an extension = not a bean archive, bean classes are added through the extension
        return new WebArchiveBuilder()
                .withTestClassPackage(SyntheticBeanInjectionPointTest.class)
                .withBuildCompatibleExtension(SyntheticBeanInjectionPointExtension.class)
                .build();
    }

    @Test
    //@SpecAssertion(section = TODO, id = "TODO")
    public void test() {
        Instance<Object> lookup = getCurrentBeanContainer().createInstance();

        // should not throw
        lookup.select(MyDependentBean.class).get();

        assertThrows(IllegalStateException.class, () -> {
            lookup.select(MyDependentBean.class).getHandle().destroy();
        });

        assertThrows(IllegalStateException.class, () -> {
            lookup.select(MyApplicationBean.class).get();
        });
    }
}
