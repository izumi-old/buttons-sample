package org.izumi.jmix.buttonssample.screen.resource;

import java.util.Objects;

import io.jmix.ui.ScreenBuilders;
import io.jmix.ui.action.Action;
import io.jmix.ui.component.GroupTable;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.screen.*;
import org.izumi.jmix.buttonssample.entity.resource.Resource;
import org.izumi.jmix.buttonssample.entity.resource.Room;
import org.izumi.jmix.buttonssample.entity.resource.Thing;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Resource.browse")
@UiDescriptor("resource-browse.xml")
@LookupComponent("resourcesTable")
public class ResourceBrowse extends StandardLookup<Resource> {

    @Autowired
    private ScreenBuilders screenBuilders;

    @Autowired
    private CollectionContainer<Resource> resourcesDc;

    @Autowired
    private GroupTable<Resource> resourcesTable;

    @Subscribe("createBtn.createRoom")
    public void onCreateBtnCreateRoom(Action.ActionPerformedEvent event) {
        final Screen editor = screenBuilders.editor(Room.class, this)
                .newEntity()
                .withOpenMode(OpenMode.DIALOG)
                /*
                in case you need to have type as stored parameter
                .withInitializer(entity -> entity.setType(Type.ROOM))
                 */
                .build();
        editor.addAfterCloseListener(e -> {
            if (!Objects.equals(e.getCloseAction(), WINDOW_COMMIT_AND_CLOSE_ACTION)) {
                return;
            }

            final Room edited = ((StandardEditor<Room>) e.getSource()).getEditedEntity();
            resourcesDc.getMutableItems().add(0, edited);
            resourcesTable.setSelected(edited);
            resourcesTable.focus();
        });
        editor.show();
    }

    @Subscribe("createBtn.createThing")
    public void onCreateBtnCreateThing(Action.ActionPerformedEvent event) {
        final Screen editor = screenBuilders.editor(Thing.class, this)
                .newEntity()
                .withOpenMode(OpenMode.DIALOG)
                /*
                in case you need to have type as stored parameter
                .withInitializer(entity -> entity.setType(Type.THING))
                 */
                .build();
        editor.addAfterCloseListener(e -> {
            if (!Objects.equals(e.getCloseAction(), WINDOW_COMMIT_AND_CLOSE_ACTION)) {
                return;
            }

            final Thing edited = ((StandardEditor<Thing>) e.getSource()).getEditedEntity();
            resourcesDc.getMutableItems().add(0, edited);
            resourcesTable.setSelected(edited);
            resourcesTable.focus();
        });
        editor.show();
    }
}
