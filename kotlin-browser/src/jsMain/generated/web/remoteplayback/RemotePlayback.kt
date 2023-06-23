// Automatically generated - do not modify!

package web.remoteplayback

import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback) */
sealed external class RemotePlayback :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/connect_event) */
    var onconnect: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/connecting_event) */
    var onconnecting: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/disconnect_event) */
    var ondisconnect: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/state) */
    val state: RemotePlaybackState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/cancelWatchAvailability) */
    fun cancelWatchAvailability(id: Number = definedExternally): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/prompt) */
    fun prompt(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/watchAvailability) */
    fun watchAvailability(callback: RemotePlaybackAvailabilityCallback): Promise<Number>
}
