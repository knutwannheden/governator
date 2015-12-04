/*
 * Copyright 2013 Netflix, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.netflix.governator.guice.lazy;

import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.Scope;
import com.google.inject.Scopes;

/**
 * A Guice {@link Scope} that enables lazy singletons
 * @deprecated Use javax.inject.Singleton instead.  LazySingleton is not needed since we run in Stage.DEVELOPMENT.
 * where any non eager singleon is lazy.
 */
@Deprecated
final class LazySingletonScopeImpl implements Scope
{
    @Override
    public <T> Provider<T> scope(Key<T> key, Provider<T> unscoped)
    {
        return Scopes.SINGLETON.scope(key, unscoped);
    }
}
