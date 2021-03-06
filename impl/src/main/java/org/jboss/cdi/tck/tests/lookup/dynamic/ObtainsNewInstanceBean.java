/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
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
package org.jboss.cdi.tck.tests.lookup.dynamic;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Instance;
import javax.enterprise.inject.New;
import javax.inject.Inject;

import org.jboss.cdi.tck.literals.NewLiteral;

public class ObtainsNewInstanceBean {
    @Inject
    @New(HashMap.class)
    private Instance<Map<String, String>> map;

    @Inject
    @New
    private Instance<String> string;

    @Inject
    Instance<IllegalArgumentException> iae;

    public Instance<String> getString() {
        return string;
    }

    public Instance<Map<String, String>> getMap() {
        return map;
    }

    public Instance<IllegalArgumentException> getIae() {
        return iae.select(new NewLiteral(IllegalArgumentException.class));
    }
}
