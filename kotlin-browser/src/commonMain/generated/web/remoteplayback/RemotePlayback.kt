// Automatically generated - do not modify!

package web.remoteplayback

import js.core.JsInt
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
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
     * The **`state`** read-only property of the RemotePlayback interface returns the current state of the `RemotePlayback` connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/state)
     */
    val state: RemotePlaybackState

    /**
     * The **`cancelWatchAvailability()`** method of the RemotePlayback interface cancels the request to watch for one or all available devices.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/cancelWatchAvailability)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun cancelWatchAvailability(id: Int = definedExternally)

    @JsName("cancelWatchAvailability")
    fun cancelWatchAvailabilityAsync(id: Int = definedExternally): Promise<Void>

    /**
     * The **`prompt()`** method of the RemotePlayback interface prompts the user to select an available remote playback device and give permission for the current media to be played using that device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/prompt)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun prompt()

    @JsName("prompt")
    fun promptAsync(): Promise<Void>

    /**
     * The **`watchAvailability()`** method of the RemotePlayback interface watches the list of available remote playback devices and returns a Promise that resolves with the `callbackId` of a remote playback device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/watchAvailability)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun watchAvailability(callback: RemotePlaybackAvailabilityCallback): Int

    @JsName("watchAvailability")
    fun watchAvailabilityAsync(callback: RemotePlaybackAvailabilityCallback): Promise<JsInt>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/connect_event)
 */
inline val RemotePlayback.connectEvent: EventInstance<Event, RemotePlayback, RemotePlayback>
    get() = EventInstance(this, "connect")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/connecting_event)
 */
inline val RemotePlayback.connectingEvent: EventInstance<Event, RemotePlayback, RemotePlayback>
    get() = EventInstance(this, "connecting")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/disconnect_event)
 */
inline val RemotePlayback.disconnectEvent: EventInstance<Event, RemotePlayback, RemotePlayback>
    get() = EventInstance(this, "disconnect")
