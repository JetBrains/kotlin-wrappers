// Automatically generated - do not modify!

package web.broadcast

import web.events.EventHandler
import web.events.EventTarget
import web.messaging.MessageEvent

external class BroadcastChannel(
    name: String,
) : EventTarget {
    /** Returns the channel name (as passed to the constructor). */
    val name: String
    var onmessage: EventHandler<MessageEvent<*>>?
    var onmessageerror: EventHandler<MessageEvent<*>>?

    /** Closes the BroadcastChannel object, opening it up to garbage collection. */
    fun close()

    /** Sends the given message to other BroadcastChannel objects set up for this channel. Messages can be structured objects, e.g. nested objects and arrays. */
    fun postMessage(message: Any?)
}
