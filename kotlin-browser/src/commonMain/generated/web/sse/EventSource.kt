// Automatically generated - do not modify!

package web.sse

import js.core.JsAny
import web.events.*
import web.messaging.MessageEvent
import web.url.URL
import kotlin.js.definedExternally

/**
 * The **`EventSource`** interface is web content's interface to server-sent events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource)
 */
open external class EventSource(
    /**
     * The **`url`** read-only property of the URL of the source.
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
     * The **`readyState`** read-only property of the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/readyState)
     */
    val readyState: ReadyState

    /**
     * The **`withCredentials`** read-only property of the the `EventSource` object was instantiated with CORS credentials set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/withCredentials)
     */
    val withCredentials: Boolean

    /**
     * The **`close()`** method of the EventSource interface closes the connection, if one is made, and sets the ```js-nolint close() ``` None.
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
    val messageEvent: EventInstance<MessageEvent<JsAny?>, EventSource /* this */, EventSource /* this */>

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
