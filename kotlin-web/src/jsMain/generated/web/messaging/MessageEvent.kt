// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
    "INVISIBLE_MEMBER",
    "INVISIBLE_REFERENCE",
)

package web.messaging

import js.array.ReadonlyArray
import web.events.Event
import web.events.EventTarget
import web.events.EventType
import kotlin.internal.LowPriorityInOverloadResolution

/**
 * A message received by a target object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent)
 */
open external class MessageEvent<out D, out C : EventTarget?>
@LowPriorityInOverloadResolution
constructor(
    override val type: EventType<MessageEvent<D, EventTarget>>,
    init: MessageEventInit<D> = definedExternally,
) : Event<C>,
    MessageEventInit<D> {
    /**
     * Returns the data of the message.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/data)
     */
    override val data: D

    /**
     * Returns the last event ID string, for server-sent events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/lastEventId)
     */
    override val lastEventId: String

    /**
     * Returns the origin of the message, for server-sent events and cross-document messaging.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/origin)
     */
    override val origin: String

    /**
     * Returns the MessagePort array sent with the message, for cross-document messaging and channel messaging.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/ports)
     */
    override val ports: ReadonlyArray<MessagePort>

    /**
     * Returns the WindowProxy of the source window, for cross-document messaging, and the MessagePort being attached, in the connect event fired at SharedWorkerGlobalScope objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/source)
     */
    override val source: MessageEventSource?

    companion object : MessageEventTypes
}
