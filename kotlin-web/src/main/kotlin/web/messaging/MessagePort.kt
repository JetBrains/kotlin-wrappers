package web.messaging

import kotlinx.js.ReadonlyArray
import web.events.EventTarget

sealed external class MessagePort : EventTarget {
    var onmessage: ((event: MessageEvent) -> Unit)?
    var onmessageerror: ((event: MessageEvent) -> Unit)?

    /** Disconnects the port, so that it is no longer active. */
    fun close()

    /**
     * Posts a message through the channel. Objects listed in transfer are transferred, not just cloned, meaning that they are no longer usable on the sending side.
     *
     * Throws a "DataCloneError" DOMException if transfer contains duplicate objects or port, or if message could not be cloned.
     */
    fun postMessage(
        message: Any?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: Any?,
        options: StructuredSerializeOptions = definedExternally,
    )

    /** Begins dispatching messages received on the port. */
    fun start()
}
