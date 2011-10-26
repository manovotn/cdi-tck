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
package org.jboss.jsr299.tck.tests.alternative;

import javax.enterprise.inject.Produces;

public class BirdProducer {

    @EnabledAlternativeStereotype
    @Produces
    @Tame
    public final Bird tameBird = new Bird();

    @NotEnabledAlternativeStereotype
    @Produces
    @Wild
    public final Bird wildBird = new Bird();

    @EnabledAlternativeStereotype
    @Produces
    @Tame
    public Bird produceTame() {
        return new Bird();
    }

    @NotEnabledAlternativeStereotype
    @Produces
    @Wild
    public Bird produceWild() {
        return new Bird();
    }

}