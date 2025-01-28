// Automatically generated - do not modify!

package web.sse

import web.events.*
import web.messaging.MessageEvent
import web.url.URL

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource)
 */
open external class EventSource(
    /**
     * Returns the URL providing the event stream.
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
     * Returns the state of this EventSource object's connection. It can have the values described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/readyState)
     */
    val readyState: ReadyState

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
    val CONNECTING: ReadyState
    val OPEN: ReadyState
    val CLOSED: ReadyState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<Event, EventSource /* this */, EventSource /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/message_event)
     */
    @JsEvent("message")
    val messageEvent: EventInstance<MessageEvent<Any?>, EventSource /* this */, EventSource /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/open_event)
     */
    @JsEvent("open")
    val openEvent: EventInstance<Event, EventSource /* this */, EventSource /* this */>

    companion object {
        val CONNECTING: ReadyState
        val OPEN: ReadyState
        val CLOSED: ReadyState
    }

    sealed interface ReadyState
}
