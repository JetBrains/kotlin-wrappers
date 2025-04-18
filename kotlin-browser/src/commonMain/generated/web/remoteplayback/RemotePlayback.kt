// Automatically generated - do not modify!

package web.remoteplayback

import js.core.JsInt
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.*
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`RemotePlayback`** interface of the Remote Playback API allows the page to detect availability of remote playback devices, then connect to and control playing on these devices.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback)
 */
external class RemotePlayback
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/connect_event)
     */
    var onconnect: EventHandler<Event, RemotePlayback, RemotePlayback>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/connecting_event)
     */
    var onconnecting: EventHandler<Event, RemotePlayback, RemotePlayback>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/disconnect_event)
     */
    var ondisconnect: EventHandler<Event, RemotePlayback, RemotePlayback>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/state)
     */
    val state: RemotePlaybackState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/cancelWatchAvailability)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun cancelWatchAvailability(id: Int = definedExternally)

    @JsName("cancelWatchAvailability")
    fun cancelWatchAvailabilityAsync(id: Int = definedExternally): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/prompt)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun prompt()

    @JsName("prompt")
    fun promptAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/watchAvailability)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun watchAvailability(callback: RemotePlaybackAvailabilityCallback): Int

    @JsName("watchAvailability")
    fun watchAvailabilityAsync(callback: RemotePlaybackAvailabilityCallback): Promise<JsInt>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/connect_event)
     */
    @JsEvent("connect")
    val connectEvent: EventInstance<Event, RemotePlayback /* this */, RemotePlayback /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/connecting_event)
     */
    @JsEvent("connecting")
    val connectingEvent: EventInstance<Event, RemotePlayback /* this */, RemotePlayback /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/disconnect_event)
     */
    @JsEvent("disconnect")
    val disconnectEvent: EventInstance<Event, RemotePlayback /* this */, RemotePlayback /* this */>
}
