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
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.kotcrab.vis.editor.converter.support.vis030.runtime.component.proto.ProtoComponent;
import com.kotcrab.vis.editor.converter.support.vis030.runtime.component.proto.ProtoVisSprite;
import com.kotcrab.vis.editor.converter.support.vis030.runtime.properties.FlipOwner;
import com.kotcrab.vis.editor.converter.support.vis030.runtime.properties.SizeOwner;
import com.kotcrab.vis.editor.converter.support.vis030.runtime.properties.Resizable;
import com.kotcrab.vis.editor.converter.support.vis030.runtime.properties.UsesProtoComponent;

/** @author Kotcrab */
public class VisSprite extends Component implements FlipOwner, SizeOwner, Resizable, UsesProtoComponent {
	private TextureRegion region;
	private float width, height;

	@Deprecated
	public VisSprite () {
	}

	public VisSprite (TextureRegion region) {
		setRegion(region);
	}

	public TextureRegion getRegion () {
		return region;
	}

	public void setRegion (TextureRegion region) {
		this.region = new TextureRegion(region);
	}

	@Override
	public boolean isFlipX () {
		return region.isFlipX();
	}

	@Override
	public boolean isFlipY () {
		return region.isFlipY();
	}

	@Override
	public void setFlip (boolean flipX, boolean flipY) {
		boolean doFlipX = false;
		boolean doFlipY = false;

		if (region.isFlipX() != flipX) doFlipX = true;
		if (region.isFlipY() != flipY) doFlipY = true;

		region.flip(doFlipX, doFlipY);
	}

	@Override
	public float getWidth () {
		return width;
	}

	@Override
	public float getHeight () {
		return height;
	}

	@Override
	public void setSize (float width, float height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public ProtoComponent toProtoComponent () {
		return new ProtoVisSprite(this);
	}
}
