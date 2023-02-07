// Automatically generated - do not modify!

package node.asyncHooks

sealed external interface AsyncResourceOptions {
    /**
     * The ID of the execution context that created this async event.
     * @default executionAsyncId()
     */
    var triggerAsyncId: Number?

    /**
     * Disables automatic `emitDestroy` when the object is garbage collected.
     * This usually does not need to be set (even if `emitDestroy` is called
     * manually), unless the resource's `asyncId` is retrieved and the
     * sensitive API's `emitDestroy` is called with it.
     * @default false
     */
    var requireManualDestroy: Boolean?
}
