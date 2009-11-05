package org.jboss.jsr299.tck.tests.context.passivating.broken.enterpriseBeanWithNonPassivatingInjectedFieldInDecorator;

import org.jboss.jsr299.tck.AbstractJSR299Test;
import org.jboss.jsr299.tck.DeploymentError;
import org.jboss.test.audit.annotations.SpecAssertion;
import org.jboss.test.audit.annotations.SpecVersion;
import org.jboss.testharness.impl.packaging.Artifact;
import org.jboss.testharness.impl.packaging.ExpectedDeploymentException;
import org.jboss.testharness.impl.packaging.Packaging;
import org.jboss.testharness.impl.packaging.PackagingType;
import org.jboss.testharness.impl.packaging.jsr299.BeansXml;
import org.testng.annotations.Test;

@Artifact
@Packaging(PackagingType.EAR)
@ExpectedDeploymentException(DeploymentError.class)
@SpecVersion(spec="cdi", version="20091101")
@BeansXml("beans.xml")
public class EnterpriseBeanWithNonPassivatingInjectedFieldInDecoratorTest extends AbstractJSR299Test
{   
   @Test(groups = { "contexts", "passivation"})
   @SpecAssertion(section = "6.6.4", id = "bdd")
   public void testSessionBeanWithNonPassivatingInjectedFieldInDecoratorFails()
   {
      assert false;
   }
   
}
