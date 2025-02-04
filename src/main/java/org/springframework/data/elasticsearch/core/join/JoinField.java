/*
 * Copyright 2020-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.elasticsearch.core.join;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.lang.Nullable;

/**
 * @author Subhobrata Dey
 * @since 4.1
 */
public class JoinField<ID> {

	private final String name;

	@Nullable private ID parent;

	public JoinField() {
		this("default", null);
	}

	public JoinField(String name) {
		this(name, null);
	}

	@PersistenceConstructor
	public JoinField(String name, @Nullable ID parent) {
		this.name = name;
		this.parent = parent;
	}

	public void setParent(@Nullable ID parent) {
		this.parent = parent;
	}

	@Nullable
	public ID getParent() {
		return parent;
	}

	public String getName() {
		return name;
	}
}
