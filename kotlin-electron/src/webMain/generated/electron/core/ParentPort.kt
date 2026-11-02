// Automatically generated - do not modify!

package electron.core

@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface ParentPort : node.events.EventEmitter {
    /**
     * Sends a message from the process to its parent.
     */
    fun postMessage(message: Any?)

    @web.events.JsEvent("message")
    val messageEvent: node.events.EventInstance<js.array.Tuple1<MessageEvent>>
}
