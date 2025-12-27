// Automatically generated - do not modify!

@file:JsModule("node:v8")
@file:JsQualifier("startupSnapshot")

package node.v8.startupSnapshot

import node.v8.StartupSnapshotCallbackFn

/**
 * Add a callback that will be called when the Node.js instance is about to get serialized into a snapshot and exit.
 * This can be used to release resources that should not or cannot be serialized or to convert user data into a form more suitable for serialization.
 * @since v18.6.0, v16.17.0
 */
external fun addSerializeCallback(
    callback: StartupSnapshotCallbackFn,
    data: Any? = definedExternally,
)
