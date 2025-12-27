// Automatically generated - do not modify!

@file:JsModule("node:v8")
@file:JsQualifier("startupSnapshot")

package node.v8.startupSnapshot

import node.v8.StartupSnapshotCallbackFn

/**
 * This sets the entry point of the Node.js application when it is deserialized from a snapshot. This can be called only once in the snapshot building script.
 * If called, the deserialized application no longer needs an additional entry point script to start up and will simply invoke the callback along with the deserialized
 * data (if provided), otherwise an entry point script still needs to be provided to the deserialized application.
 * @since v18.6.0, v16.17.0
 */
external fun setDeserializeMainFunction(
    callback: StartupSnapshotCallbackFn,
    data: Any? = definedExternally,
)
