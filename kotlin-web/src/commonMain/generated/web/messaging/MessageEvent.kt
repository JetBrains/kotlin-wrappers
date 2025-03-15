// Automatically generated - do not modify!

package web.messaging

import js.array.ReadonlyArray
import js.core.JsAny
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * A message received by a target object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent)
 */
open external class MessageEvent<out D : JsAny?>(
    override val type: EventType<MessageEvent<D>>,
    init: MessageEventInit<D> = definedExternally,
) : Event {
    /**
     * Returns the data of the message.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/data)
     */
    val data: D

    /**
     * Returns the last event ID string, for server-sent events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/lastEventId)
     */
    val lastEventId: String

    /**
     * Returns the origin of the message, for server-sent events and cross-document messaging.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/origin)
     */
    val origin: String

    /**
     * Returns the MessagePort array sent with the message, for cross-document messaging and channel messaging.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/ports)
     */
    val ports: ReadonlyArray<MessagePort>

    /**
     * Returns the WindowProxy of the source window, for cross-document messaging, and the MessagePort being attached, in the connect event fired at SharedWorkerGlobalScope objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/source)
     */
    val source: MessageEventSource?

    @JsAlias(THIS)
    override fun asInit(): MessageEventInit<D>

    companion object {
        @JsValue("connect")
        val CONNECT: EventType<MessageEvent<*>>

        @JsValue("message")
        val MESSAGE: EventType<MessageEvent<*>>

        @JsValue("messageerror")
        val MESSAGE_ERROR: EventType<MessageEvent<*>>
    }
}
