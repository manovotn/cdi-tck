package org.jboss.cdi.tck.tests.build.compatible.extensions.customStereotype;

import jakarta.enterprise.inject.Stereotype;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A stereotype with no other annotations. Server purely as bean defining annotation for {@link MyService}
 */
@Retention(RetentionPolicy.RUNTIME)
@Stereotype
public @interface DummyStereotype {
}
