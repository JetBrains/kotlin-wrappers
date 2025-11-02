// Automatically generated - do not modify!

package web.broadcast

import js.closeable.JsCloseable
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.messaging.MessageEvent
import kotlin.js.JsAny

/**
 * The **`BroadcastChannel`** interface represents a named channel that any browsing context of a given origin can subscribe to. It allows communication between different documents (in different windows, tabs, frames or iframes) of the same origin. Messages are broadcasted via a message event fired at all BroadcastChannel objects listening to the channel, except the object that sent the message.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel)
 */
open external class BroadcastChannel(
    /**
     * The **`name`** read-only property of the BroadcastChannel interface returns a string, which uniquely identifies the given channel with its name. This name is passed to the BroadcastChannel() constructor at creation time and is therefore read-only.
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
     * The **`close()`** method of the BroadcastChannel interface terminates the connection to the underlying channel, allowing the object to be garbage collected. This is a necessary step to perform as there is no other way for a browser to know that this channel is not needed anymore.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/close)
     */
    override fun close()

    /**
     * The **`postMessage()`** method of the BroadcastChannel interface sends a message, which can be of any kind of Object, to each listener in any browsing context with the same origin. The message is transmitted as a message event targeted at each BroadcastChannel bound to the channel.
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
