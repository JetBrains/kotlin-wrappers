// Automatically generated - do not modify!

package web.broadcast

import web.events.EventHandler
import web.events.EventTarget
import web.messaging.MessageEvent

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel) */
external class BroadcastChannel(
    name: String,
) : EventTarget {
    /**
     * Returns the channel name (as passed to the constructor).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/name)
     */
    val name: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/message_event) */
    var onmessage: EventHandler<MessageEvent<*>>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/messageerror_event) */
    var onmessageerror: EventHandler<MessageEvent<*>>?

    /**
     * Closes the BroadcastChannel object, opening it up to garbage collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/close)
     */
    fun close()

    /**
     * Sends the given message to other BroadcastChannel objects set up for this channel. Messages can be structured objects, e.g. nested objects and arrays.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/postMessage)
     */
    fun postMessage(message: Any?)
}
