// Automatically generated - do not modify!

package remoteplayback

import kotlinx.js.Void
import web.events.Event
import web.events.EventTarget
import kotlin.js.Promise

sealed external class RemotePlayback :
    EventTarget {
    var onconnect: ((event: Event) -> Unit)?
    var onconnecting: ((event: Event) -> Unit)?
    var ondisconnect: ((event: Event) -> Unit)?
    val state: RemotePlaybackState
    fun cancelWatchAvailability(id: Number = definedExternally): Promise<Void>
    fun prompt(): Promise<Void>
    fun watchAvailability(callback: RemotePlaybackAvailabilityCallback): Promise<Number>
}
