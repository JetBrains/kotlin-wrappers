// Automatically generated - do not modify!

package web.sse

import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.messaging.MessageEvent
import web.url.URL
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`EventSource`** interface is web content's interface to server-sent events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource)
 */
open external class EventSource(
    /**
     * The **`url`** read-only property of the EventSource interface returns a string representing the URL of the source.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/url)
     */
    val url: String,
    init: EventSourceInit = definedExternally,
) : EventTarget {
    constructor(
        url: URL,
        init: EventSourceInit = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/error_event)
     */
    var onerror: EventHandler<Event, EventSource, EventSource>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/message_event)
     */
    var onmessage: EventHandler<MessageEvent<*>, EventSource, EventSource>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/open_event)
     */
    var onopen: EventHandler<Event, EventSource, EventSource>?

    /**
     * The **`readyState`** read-only property of the EventSource interface returns a number representing the state of the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/readyState)
     */
    val readyState: ReadyState

    /**
     * The **`withCredentials`** read-only property of the EventSource interface returns a boolean value indicating whether the `EventSource` object was instantiated with CORS credentials set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/withCredentials)
     */
    val withCredentials: Boolean

    /**
     * The **`close()`** method of the EventSource interface closes the connection, if one is made, and sets the EventSource.readyState attribute to `2` (closed).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/close)
     */
    fun close()
    val CONNECTING: ReadyState
    val OPEN: ReadyState
    val CLOSED: ReadyState

    companion object {
        val CONNECTING: ReadyState
        val OPEN: ReadyState
        val CLOSED: ReadyState
    }

    sealed interface ReadyState
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/error_event)
 */
inline val <C : EventSource> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/message_event)
 */
inline val <C : EventSource> C.messageEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "message")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/open_event)
 */
inline val <C : EventSource> C.openEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "open")
