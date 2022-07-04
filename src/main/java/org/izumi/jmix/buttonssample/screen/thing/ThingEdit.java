package org.izumi.jmix.buttonssample.screen.thing;

import io.jmix.ui.screen.*;
import org.izumi.jmix.buttonssample.entity.resource.Thing;

@UiController("Thing.edit")
@UiDescriptor("thing-edit.xml")
@EditedEntityContainer("thingDc")
public class ThingEdit extends StandardEditor<Thing> {
}
