// Automatically generated - do not modify!

package web.broadcast

import js.closeable.JsCloseable
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.messaging.MessageEvent
import kotlin.js.JsAny

/**
 * The **`BroadcastChannel`** interface represents a named channel that any browsing context of a given origin can subscribe to.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel)
 */
open external class BroadcastChannel(
    /**
     * The **`name`** read-only property of the BroadcastChannel interface returns a string, which uniquely identifies the given channel with its name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/name)
     */
    val name: String,
) : EventTarget,
    JsCloseable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/message_event)
     */
    var onmessage: EventHandler<MessageEvent<*>, BroadcastChannel, BroadcastChannel>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/messageerror_event)
     */
    var onmessageerror: EventHandler<MessageEvent<*>, BroadcastChannel, BroadcastChannel>?

    /**
     * The **`close()`** method of the BroadcastChannel interface terminates the connection to the underlying channel, allowing the object to be garbage collected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/close)
     */
    override fun close()

    /**
     * The **`postMessage()`** method of the BroadcastChannel interface sends a message, which can be of any kind of Object, to each listener in any browsing context with the same origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/postMessage)
     */
    fun postMessage(message: JsAny?)
    fun postMessage(message: String)
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/message_event)
 */
inline val <C : BroadcastChannel> C.messageEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "message")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/messageerror_event)
 */
inline val <C : BroadcastChannel> C.messageErrorEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "messageerror")
