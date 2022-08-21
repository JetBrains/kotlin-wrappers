// Automatically generated - do not modify!

package node.asyncHooks

sealed external interface HookCallbacks {
    /**
     * Called when a class is constructed that has the possibility to emit an asynchronous event.
     * @param asyncId a unique ID for the async resource
     * @param type the type of the async resource
     * @param triggerAsyncId the unique ID of the async resource in whose execution context this async resource was created
     * @param resource reference to the resource representing the async operation, needs to be released during destroy
     */
    var init: ((
        asyncId: Number,
        type: String,
        triggerAsyncId: Number,
        resource: Any,
    ) -> Unit)?

    /**
     * When an asynchronous operation is initiated or completes a callback is called to notify the user.
     * The before callback is called just before said callback is executed.
     * @param asyncId the unique identifier assigned to the resource about to execute the callback.
     */
    var before: ((asyncId: Number) -> Unit)?

    /**
     * Called immediately after the callback specified in before is completed.
     * @param asyncId the unique identifier assigned to the resource which has executed the callback.
     */
    var after: ((asyncId: Number) -> Unit)?

    /**
     * Called when a promise has resolve() called. This may not be in the same execution id
     * as the promise itself.
     * @param asyncId the unique id for the promise that was resolve()d.
     */
    var promiseResolve: ((asyncId: Number) -> Unit)?

    /**
     * Called after the resource corresponding to asyncId is destroyed
     * @param asyncId a unique ID for the async resource
     */
    var destroy: ((asyncId: Number) -> Unit)?
}
