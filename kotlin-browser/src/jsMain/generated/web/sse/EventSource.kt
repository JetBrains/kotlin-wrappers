// Automatically generated - do not modify!

package web.sse

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.messaging.MessageEvent
import web.url.URL

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource) */
external class EventSource(
    url: String,
    init: EventSourceInit = definedExternally,
) : EventTarget {
    constructor(
        url: URL,
        init: EventSourceInit = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/error_event) */
    var onerror: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/message_event) */
    var onmessage: EventHandler<MessageEvent<*>>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/open_event) */
    var onopen: EventHandler<Event>?

    /**
     * Returns the state of this EventSource object's connection. It can have the values described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/readyState)
     */
    val readyState: Short

    /**
     * Returns the URL providing the event stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/url)
     */
    val url: String

    /**
     * Returns true if the credentials mode for connection requests to the URL providing the event stream is set to "include", and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/withCredentials)
     */
    val withCredentials: Boolean

    /**
     * Aborts any instances of the fetch algorithm started for this EventSource object, and sets the readyState attribute to CLOSED.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/close)
     */
    fun close()
    val CONNECTING: Short
    val OPEN: Short
    val CLOSED: Short

    companion object {
        val CONNECTING: Short
        val OPEN: Short
        val CLOSED: Short
    }
}
