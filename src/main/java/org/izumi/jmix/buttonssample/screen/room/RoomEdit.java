package org.izumi.jmix.buttonssample.screen.room;

import io.jmix.ui.screen.*;
import org.izumi.jmix.buttonssample.entity.resource.Room;

@UiController("Room.edit")
@UiDescriptor("room-edit.xml")
@EditedEntityContainer("roomDc")
public class RoomEdit extends StandardEditor<Room> {
}
