// Automatically generated - do not modify!

package web.remoteplayback

import js.core.Void
import js.promise.Promise
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback)
 */
sealed external class RemotePlayback :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/connect_event)
     */
    var onconnect: EventHandler<Event, RemotePlayback>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/connecting_event)
     */
    var onconnecting: EventHandler<Event, RemotePlayback>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/disconnect_event)
     */
    var ondisconnect: EventHandler<Event, RemotePlayback>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/state)
     */
    val state: RemotePlaybackState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/cancelWatchAvailability)
     */
    suspend fun cancelWatchAvailability(id: Int = definedExternally)

    @JsName("cancelWatchAvailability")
    fun cancelWatchAvailabilityAsync(id: Int = definedExternally): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/prompt)
     */
    suspend fun prompt()

    @JsName("prompt")
    fun promptAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/watchAvailability)
     */
    suspend fun watchAvailability(callback: RemotePlaybackAvailabilityCallback): Number

    @JsName("watchAvailability")
    fun watchAvailabilityAsync(callback: RemotePlaybackAvailabilityCallback): Promise<Number>
}
