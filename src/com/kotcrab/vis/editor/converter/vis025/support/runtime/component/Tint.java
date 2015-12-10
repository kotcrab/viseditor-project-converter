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

package com.kotcrab.vis.editor.converter.vis025.support.runtime.component;

import com.artemis.Component;
import com.badlogic.gdx.graphics.Color;
import com.kotcrab.vis.editor.converter.vis025.support.runtime.properties.TintOwner;

/** @author Kotcrab */
public class Tint extends Component implements TintOwner {
	private transient boolean dirty = true;
	private Color tint;

	public Tint () {
		tint = Color.WHITE;
	}

	public Tint (Color tint) {
		this.tint = tint;
	}

	@Override
	public Color getTint () {
		return tint;
	}

	@Override
	public void setTint (Color tint) {
		this.tint = tint;
		dirty = true;
	}

	public boolean isDirty () {
		return dirty;
	}

	public void setDirty (boolean dirty) {
		this.dirty = dirty;
	}
}
