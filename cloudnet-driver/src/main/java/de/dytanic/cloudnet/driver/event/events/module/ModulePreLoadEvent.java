package de.dytanic.cloudnet.driver.event.events.module;

import de.dytanic.cloudnet.driver.module.IModuleProvider;
import de.dytanic.cloudnet.driver.module.IModuleWrapper;
import de.dytanic.cloudnet.driver.module.ModuleLifeCycle;

/**
 * This event is being called after a module has been loaded and before the tasks with the lifecycle {@link ModuleLifeCycle#LOADED} of this module have been fired.
 * {@link IModuleWrapper#getModuleLifeCycle()} is still {@link ModuleLifeCycle#UNLOADED}.
 */
public final class ModulePreLoadEvent extends ModuleEvent {

    public ModulePreLoadEvent(IModuleProvider moduleProvider, IModuleWrapper module) {
        super(moduleProvider, module);
    }
}