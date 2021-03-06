package com.kotcrab.vis.editor.converter.vis025.transformer;

import com.artemis.Component;
import com.artemis.Entity;
import com.badlogic.gdx.utils.Array;
import com.kotcrab.vis.editor.converter.support.vis030.runtime.component.Point;
import com.kotcrab.vis.editor.converter.support.vis030.runtime.component.Transform;
import com.kotcrab.vis.editor.plugin.api.support.ComponentTransformer;
import com.kotcrab.vis.runtime.component.PointComponent;

/** @author Kotcrab */
public class PointTransformer extends ComponentTransformer<PointComponent> {
	@Override
	public void transform (Entity entity, Array<Component> components, PointComponent component) {
		Transform transform = new Transform();
		transform.setPosition(component.x, component.y);

		components.add(new Point());
		components.add(transform);
	}
}
