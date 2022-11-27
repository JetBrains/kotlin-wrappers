// Automatically generated - do not modify!

package remoteplayback

import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

sealed external class RemotePlayback :
    EventTarget {
    var onconnect: EventHandler<Event>?
    var onconnecting: EventHandler<Event>?
    var ondisconnect: EventHandler<Event>?
    val state: RemotePlaybackState
    fun cancelWatchAvailability(id: Number = definedExternally): Promise<Void>
    fun prompt(): Promise<Void>
    fun watchAvailability(callback: RemotePlaybackAvailabilityCallback): Promise<Number>
}
