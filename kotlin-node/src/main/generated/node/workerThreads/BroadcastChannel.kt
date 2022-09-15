// Automatically generated - do not modify!

@file:JsModule("node:worker_threads")
@file:JsNonModule

package node.workerThreads

external class BroadcastChannel : IBroadcastChannel {

    override fun ref() /* : this */
    override fun unref() /* : this */

    val name: String

    /**
     * Invoked with a single \`MessageEvent\` argument when a message is received.
     * @since v15.4.0
     */
    var onmessage: (message: Any?) -> Unit

    /**
     * Invoked with a received message cannot be deserialized.
     * @since v15.4.0
     */
    var onmessageerror: (message: Any?) -> Unit

    constructor(name: String)

    /**
     * Closes the `BroadcastChannel` connection.
     * @since v15.4.0
     */
    fun close()

    /**
     * @since v15.4.0
     * @param message Any cloneable JavaScript value.
     */
    fun postMessage(message: Any?)
}
