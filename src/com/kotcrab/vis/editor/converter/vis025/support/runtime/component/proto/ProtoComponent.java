/*
 * Copyright 2014-2015 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kotcrab.vis.editor.converter.vis025.support.runtime.component.proto;

import com.artemis.Component;
import com.kotcrab.vis.editor.converter.vis025.support.runtime.properties.UsesProtoComponent;

/**
 * Base class for all ProtoComponent, see {@link UsesProtoComponent} for details when to use ProtoComponents
 * @author Kotcrab
 * @see UsesProtoComponent
 */
public abstract class ProtoComponent<T> extends Component {
	public abstract void fill (T target);
}
