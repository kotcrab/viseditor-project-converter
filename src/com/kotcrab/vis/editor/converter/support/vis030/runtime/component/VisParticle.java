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

package com.kotcrab.vis.editor.converter.support.vis030.runtime.component;

import com.artemis.Component;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.kotcrab.vis.editor.converter.support.vis030.runtime.component.proto.ProtoComponent;
import com.kotcrab.vis.editor.converter.support.vis030.runtime.component.proto.ProtoVisParticle;
import com.kotcrab.vis.editor.converter.support.vis030.runtime.properties.UsesProtoComponent;

/**
 * Stores particle effect
 * @author Kotcrab
 */
public class VisParticle extends Component implements UsesProtoComponent {
	private transient ParticleEffect effect;
	private boolean activeOnStart = true;

	public VisParticle () {
	}

	public VisParticle (ParticleEffect effect) {
		this.effect = effect;
	}

	@Override
	public ProtoComponent<VisParticle> toProtoComponent () {
		return new ProtoVisParticle(this);
	}

	public void updateValues (float x, float y) {
		effect.setPosition(x, y);
		reset();
	}

	public void reset () {
		effect.reset();
	}

	public void setEffect (ParticleEffect effect) {
		this.effect = effect;
	}

	public ParticleEffect getEffect () {
		return effect;
	}

	public boolean isActiveOnStart () {
		return activeOnStart;
	}

	public void setActiveOnStart (boolean activeOnStart) {
		this.activeOnStart = activeOnStart;
	}
}
