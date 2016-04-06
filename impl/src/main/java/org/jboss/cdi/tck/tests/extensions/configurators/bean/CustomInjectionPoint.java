/*
 * JBoss, Home of Professional Open Source
 * Copyright 2016, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.cdi.tck.tests.extensions.configurators.bean;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.AnnotatedField;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.InjectionPoint;

/** TODO
 * copy pasted class, not used yet
 *
 * @author <a href="mailto:manovotn@redhat.com">Matej Novotny</a>
 */
public class CustomInjectionPoint implements InjectionPoint{
    
    private Type type;

    private Bean<?> bean;

    private boolean isTransient;

    private AnnotatedField<?> annotatedField;

    private static Set<Class<?>> membersClasses = new HashSet<>();

    public CustomInjectionPoint(Type type, Bean<?> bean, boolean isTransient, AnnotatedField<?> annotatedField) {
        this.type = type;
        this.bean = bean;
        this.isTransient = isTransient;
        this.annotatedField = annotatedField;
    }
    
    @Override
    public Type getType() {
        return type;
    }

    @Override
    public Set<Annotation> getQualifiers() {
        return Collections.singleton(Default.Literal.INSTANCE);
    }

    @Override
    public Bean<?> getBean() {
        return bean;
    }

    @Override
    public Member getMember() {
       membersClasses.add(annotatedField.getJavaMember().getType());
       return annotatedField.getJavaMember();
    }

    @Override
    public Annotated getAnnotated() {
        return annotatedField;
    }

    @Override
    public boolean isDelegate() {
        return false;
    }

    @Override
    public boolean isTransient() {
        return isTransient;
    }
}
