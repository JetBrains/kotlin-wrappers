// Automatically generated - do not modify!

package web.sse

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.messaging.MessageEvent
import web.url.URL

external class EventSource(
    url: String,
    init: EventSourceInit = definedExternally,
) : EventTarget {
    constructor(
        url: URL,
        init: EventSourceInit = definedExternally,
    )

    var onerror: EventHandler<Event>?
    var onmessage: EventHandler<MessageEvent<*>>?
    var onopen: EventHandler<Event>?

    /** Returns the state of this EventSource object's connection. It can have the values described below. */
    val readyState: Short

    /** Returns the URL providing the event stream. */
    val url: String

    /** Returns true if the credentials mode for connection requests to the URL providing the event stream is set to "include", and false otherwise. */
    val withCredentials: Boolean

    /** Aborts any instances of the fetch algorithm started for this EventSource object, and sets the readyState attribute to CLOSED. */
    fun close()
    val CLOSED: Short
    val CONNECTING: Short
    val OPEN: Short

    companion object {
        val CLOSED: Short
        val CONNECTING: Short
        val OPEN: Short
    }
}
